package com.aixcode.autoTest;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.aixcode.autoTest.Util.listFiles;


public class SampleHelper {
    public static void main(String[] args) {

        Map<Integer,Integer> taskIdMap=taskIdMap();
//
//        transferOneFileAixcoder(new File("src/main/com/aixcode/autoTest/aixcoder/Aixcoder2.java"),taskIdMap);
//        transferAllFileUnderDir();
        assembleFile("src/main/com/aixcode/resource/modelV2.jsonl");
    }

    private static void transferAllFileUnderDir(){
        try {
            Map<Integer,Integer> taskIdMap=taskIdMap();
            List<String> files=listFiles("src/main/com/aixcode/autoTest/aixcoder");
            for(String file:files){
                file="src/main/com/aixcode/autoTest/aixcoder/"+file;
                System.out.println(file);
//                transferOneFileAixcoder(new File(file),taskIdMap);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void assembleFile(String fileName){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = null;
            List<String> lines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            for(String codeLine:lines){
                assembleOneFile(codeLine);
//                break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void assembleOneFile(String preditionLine) {
        try {
            Gson gson=new Gson();
            Map<String,Object> gsonLine=gson.fromJson(preditionLine,Map.class);
            Integer fileId=((Double)gsonLine.get("task_id")).intValue();
            String newFileName="src/main/com/aixcode/autoTest/aixcoderV2/AixcoderOld"+fileId+".java";
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(newFileName));

            String line1="package main.com.aixcode.autoTest.aixcoderV2;\n";
            bw.write(line1+"\n");
            bw.write("import main.com.aixcode.autoTest.GenerateMethodBase;\n");

            bw.write("public class AixcoderOld"+fileId+" extends GenerateMethodBase {\n");
            if (gsonLine.get("code")!=null&&gsonLine.get("code")!=""){
                bw.write("    "+gsonLine.get("signature")+"\n");
                bw.write("        "+gsonLine.get("code")+"\n");
            }else{
                bw.write("    "+gsonLine.get("signature")+"{\n}");
            }

            bw.write("    }\n");

            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void transferOneFile(File file, Map<Integer,Integer> taskIdMap){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            List<String> lines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            String LineNum=file.getName().substring("Copilot".length(),file.getName().lastIndexOf("."));
            int taskId=taskIdMap.get(Integer.parseInt(LineNum));
            String newFileName="src/main/com/aixcode/autoTest/generate/GenerateMethod"+taskId+".java";
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(newFileName));
            for (String line1:lines){
                if (line1.startsWith("package")) {
                    line1="package main.com.aixcode.autoTest.generate;\n";
                    bw.write(line1+"\n");
                    bw.write("import main.com.aixcode.autoTest.GenerateMethodBase;\n");
                    continue;
                }
                if (line1.startsWith("public class Copilot")) {
                    line1="public class GenerateMethod"+taskId+" extends GenerateMethodBase {";
                }
                if (line1.contains(" static ")){
                    line1=line1.replace(" static "," ");
                }
                bw.write(line1+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void transferOneFileAixcoder(File file, Map<Integer,Integer> taskIdMap){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            List<String> lines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            String LineNum=file.getName().substring("Aixcoder".length(),file.getName().lastIndexOf("."));
            int taskId=taskIdMap.get(Integer.parseInt(LineNum));
            String newFileName="src/main/com/aixcode/autoTest/aixcoder/auto/AixcoderAuto"+taskId+".java";
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(newFileName));
            for (String line1:lines){
                if (line1.startsWith("package")) {
                    line1="package main.com.aixcode.autoTest.aixcoder.auto;\n";
                    bw.write(line1+"\n");
                    bw.write("import main.com.aixcode.autoTest.GenerateMethodBase;\n");
                    continue;
                }
                if (line1.startsWith("public class Aixcoder")) {
                    line1="public class AixcoderAuto"+taskId+" extends GenerateMethodBase {";
                }
                if (line1.contains(" static ")){
                    line1=line1.replace(" static "," ");
                }
                bw.write(line1+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Map<Integer,Integer> taskIdMap(){
        Map<Integer, Integer> resMap = new HashMap<>();
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/main/com/aixcode/resource/dataset_oneline.jsonl"));
            String tempStr=null;
            while ((tempStr=br.readLine())!=null){
                Map keyValue=new Gson().fromJson(tempStr,Map.class);
                resMap.put( Double.valueOf((double)keyValue.get("line_num")).intValue(),Double.valueOf((double)keyValue.get("task_id")).intValue());
            }
            return resMap;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private void getDiffId() {
        try {
            // 此处使用的文件为上面代码中保存的 cabinet.json 文件
            // 读取文件中的数据
            BufferedReader br = new BufferedReader(new FileReader("src/main/com/aixcode/resource/samples_all.jsonl"));
            String tempStr=null;
            List<String> numList=new ArrayList<>(128);
            while((tempStr = br.readLine())!=null){
                if (tempStr.startsWith("  \"line_num\":")){
                    numList.add(tempStr.substring(tempStr.indexOf(":")+2,tempStr.indexOf(",")));
                }
            }
            br.close();
            List<String> fileNames=listFiles("src/main/com/aixcode/autoTest/check/");
            List<String> fileIds=fileNames.stream().map(fileName->fileName.substring("Check".length(),fileName.lastIndexOf("."))).collect(Collectors.toList());
            numList.removeAll(fileIds);
            System.out.println("numList:"+numList);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
