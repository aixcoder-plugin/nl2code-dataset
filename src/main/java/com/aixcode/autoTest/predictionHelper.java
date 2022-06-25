package com.aixcode.autoTest;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class predictionHelper {
    public static void main(String[] args) {

        assembleFile("src/main/resources/prediction.jsonl");
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
            String newFileName="src/main/java/com/aixcode/autoTest/aixcoderV23/Aixcoder"+fileId+".java";
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(newFileName));

            String line1="package com.aixcode.autoTest.aixcoderV23;\n";
            bw.write(line1+"\n");
            bw.write("import com.aixcode.autoTest.GenerateMethodBase;\n");

            bw.write("public class Aixcoder"+fileId+" extends GenerateMethodBase {\n");
            String signature=String.valueOf(gsonLine.get("signature")).replace("public static","public");
            if (gsonLine.get("code")!=null&&gsonLine.get("code")!=""){
//                bw.write("    "+signature+"\n");
                String code=String.valueOf(gsonLine.get("code")).replace("public static","public");
                bw.write("        "+code+"\n");
            }else{
                bw.write("    "+signature+"{\n}");
            }

            bw.write("    }\n");

            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
