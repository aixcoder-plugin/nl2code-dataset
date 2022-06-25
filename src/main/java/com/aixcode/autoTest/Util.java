package com.aixcode.autoTest;

import com.google.gson.Gson;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {
    public static List<String> listFiles(String path) {
        File file = new File(path);
        List<String> res = new ArrayList<String>();
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isDirectory())
                res.add(files[i].getName());
        }
        return res;
    }

    public static List<String> titles = new ArrayList<String>(){
        {
            add("taskId");
            add("通过的单元测试数");
            add("测试数总数");
            add("aixcoder通过率");
            add("是否全部通过");
            add("");
            add("通过的单元测试数");
            add("单元测试数总数");
            add("copilot通过率");
            add("是否全部通过");
            add("");
            add("nl自然语言");
            add("signature函数签名");
        }
    };

    public static void exportExcel(Map<String,int[]> dataMap,Map<String,int[]> dataMap1,String sheetName,String fileName){
        WritableWorkbook workbook=null;
        WritableSheet sheet=null;
        Map<String,String[]> sampleMap=getSampleMap("src/main/resources/prediction.jsonl");
        try {
            workbook = Workbook.createWorkbook(new File(fileName));
            sheet = workbook.createSheet(sheetName, 0);
            sheet.mergeCells( 1 , 0 , 4 , 0 );
            sheet.addCell(new Label(1, 0, "Aixcoder测试结果"));
            sheet.mergeCells( 6 , 0 , 9 , 0 );
            sheet.addCell(new Label(6, 0, "Copilot测试结果"));
            for (int i = 0; i < titles.size(); i++) {
                sheet.addCell(new Label(i, 1, titles.get(i)));
            }
            int aixcoderPassCount=0;
            int copilotPassCount=0;

            int aixcoderPassAllCount=0;
            int copilotPassAllCount=0;

            double aixcoderScore=0;
            double copilotScore=0;

            int aixcoderTotalCount=0;
            int copilotTotalCount=0;
            int row = 2;
            for (int i = 0; i < 200; i++) {
                String taskId=String.valueOf(i);
                if (!dataMap.containsKey(taskId)){
                    continue;
                }
                int[] data=dataMap.get(taskId);
                sheet.addCell(new Label(0, row, taskId));
                sheet.addCell(new Label(1, row, String.valueOf(data[0])));
                sheet.addCell(new Label(2, row, String.valueOf(data[1])));
                double rate=0;
                boolean passAll=false;
                if (data!=null&&data.length==2&&data[1]!=0){
                    aixcoderPassCount+=data[0];
                    aixcoderTotalCount+=data[1];
                    rate=(double) data[0]/data[1];
                    aixcoderScore+=rate;
                    if (data[0]==data[1]){
                        passAll=true;
                        aixcoderPassAllCount++;
                    }
                }
                sheet.addCell(new Label(3, row, String.valueOf(rate)));
                sheet.addCell(new Label(4, row, String.valueOf(passAll)));

                data=dataMap1.get(taskId);
                sheet.addCell(new Label(6, row, String.valueOf(data[0])));
                sheet.addCell(new Label(7, row, String.valueOf(data[1])));
                rate=0;
                passAll=false;
                if (data!=null&&data.length==2&&data[1]!=0){
                    copilotPassCount+=data[0];
                    copilotTotalCount+=data[1];
                    rate=(double) data[0]/data[1];
                    copilotScore+=rate;
                    if (data[0]==data[1]){
                        passAll=true;
                        copilotPassAllCount++;
                    }
                }
                sheet.addCell(new Label(8, row, String.valueOf(rate)));
                sheet.addCell(new Label(9, row, String.valueOf(passAll)));

                sheet.addCell(new Label(11, row, String.valueOf(sampleMap.get(taskId)[0])));
                sheet.addCell(new Label(12, row, String.valueOf(sampleMap.get(taskId)[1])));
                row+=1;
            }
            sheet.addCell(new Label(0, row, "sum(列求和)"));

            sheet.addCell(new Label(1, row, String.valueOf(aixcoderPassCount)));
            sheet.addCell(new Label(2, row, String.valueOf(aixcoderTotalCount)));
            sheet.addCell(new Label(3, row, String.valueOf(aixcoderScore)));
            sheet.addCell(new Label(4, row, String.valueOf(aixcoderPassAllCount)+"(true=1,false=0)"));

            sheet.addCell(new Label(6, row, String.valueOf(copilotPassCount)));
            sheet.addCell(new Label(7, row, String.valueOf(copilotTotalCount)));
            sheet.addCell(new Label(8, row, String.valueOf(copilotScore)));
            sheet.addCell(new Label(9, row, String.valueOf(copilotPassAllCount+"(true=1,false=0)")));
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            try {

                workbook.write();
                workbook.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static Map<String,String[]> getSampleMap(String fileName){
        Map<String,String[]> sampleMap=new HashMap<>();
        Gson gson=new Gson();

        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = null;
            List<String> lines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            for(String codeLine:lines){
                Map<String,Object> gsonLine=gson.fromJson(codeLine,Map.class);
                int taskIdInt=Double.valueOf((double)gsonLine.get("task_id")).intValue();
                String taskId=String.valueOf(taskIdInt);
                String nl=String.valueOf(gsonLine.get("raw_nl"));
                String signature=String.valueOf(gsonLine.get("signature"));

                sampleMap.put(taskId,new String[]{nl,signature});
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return sampleMap;

    }
}
