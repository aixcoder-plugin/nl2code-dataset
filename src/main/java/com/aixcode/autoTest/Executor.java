package com.aixcode.autoTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.aixcode.autoTest.Util.listFiles;

public class Executor {
    public static void main(String[] args) {
        try {
            //执行的line_num,只需要修改这个值即可
            String line_num="153";
//            evaluationOneExample("com.aixcode.autoTest.generate.copilot","GenerateMethod",line_num);

//            runAllTest("com.aixcode.autoTest.generate.copilot","GenerateMethod","Copilot模型",0,186);
            runAllTest("com.aixcode.autoTest.generate.aixcoder","AixcoderOld","前一版",0,186);
            runAllTest("com.aixcode.autoTest.aixcoderV23","Aixcoder","最新一版",0,186);

//            getResultDiff();


        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void evaluationOneExample(String basePackage,String prefix,String fileId){
        try {
            int[] result= evaluationGenerateMethod(fileId,basePackage,prefix);
            System.out.println(prefix+" result:"+result[0]+"/"+result[1]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }






    public static double[] runAllTest(String basePackage,String prefix,String message,int minFileId,int maxFileId){
        try {
            List<String> fileNames=listFiles("src/main/java/com/aixcode/autoTest/evaluation");
            List<String> fileIds=fileNames.stream().map(fileName->fileName.substring("Evaluation".length(),fileName.lastIndexOf("."))).collect(Collectors.toList());

            double copilot_score=0;
            int CopilotExacttCount=0;
            int totalCount=0;
            for(String fileId:fileIds){
                if (!(Integer.parseInt(fileId)>=minFileId&&Integer.parseInt(fileId)<=maxFileId)){
                    continue;
                }
//                System.out.println("start process fileId:"+fileId);
                totalCount++;
                int[] result= evaluationGenerateMethod(fileId,basePackage,prefix);
                if (result!=null&&result.length==2&&result[1]!=0){
                    copilot_score+=(double) result[0]/result[1];
                    if (result[0]==result[1]){
                        CopilotExacttCount++;
                    }
                }
            }
            System.out.println(message+"模型测试结果：部分通过归一化求和:"+copilot_score+"  完全通过的测试用例数:"+CopilotExacttCount);
            System.out.println("totalCount:"+totalCount);
            return new double[]{copilot_score,CopilotExacttCount,totalCount};
        }catch (Exception e){
            e.printStackTrace();
        }
        return new double[]{0,0,0};
    }

    public static Map<String,int[]> runAllTestReturnMap(String basePackage, String prefix, String message, int minFileId, int maxFileId){
        try {
            List<String> fileNames=listFiles("src/main/java/com/aixcode/autoTest/evaluation");
            List<String> fileIds=fileNames.stream().map(fileName->fileName.substring("Evaluation".length(),fileName.lastIndexOf("."))).collect(Collectors.toList());

            double copilot_score=0;
            int CopilotExacttCount=0;
            int totalCount=0;
            Map<String,int[]> resultMap=new HashMap<>();
            for(String fileId:fileIds){
                if (!(Integer.parseInt(fileId)>=minFileId&&Integer.parseInt(fileId)<=maxFileId)){
                    continue;
                }
//                System.out.println("start process fileId:"+fileId);
                totalCount++;
                int[] result= evaluationGenerateMethod(fileId,basePackage,prefix);
                resultMap.put(fileId,result);

            }
            return resultMap;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void getResultDiff(){
        Map<String,int[]> aixcoderResult1=runAllTestReturnMap("com.aixcode.autoTest.generate.aixcoder","AixcoderOld","old模型自动生成",0,186);
        Map<String,int[]> aixcoderResult2=runAllTestReturnMap("com.aixcode.autoTest.aixcoderV23","Aixcoder","新模型自动生成",0,186);
        for (int i=0;i<200;i++) {
            String taskId=String.valueOf(i);
            if (aixcoderResult1.containsKey(taskId)&&aixcoderResult2.containsKey(taskId)){
                int[] result1=aixcoderResult1.get(taskId);
                int[] result2=aixcoderResult2.get(taskId);
                if (result1[0]>result2[0]){
                    System.out.println(taskId+"\t"+result1[0]+"\t"+result2[0]);
                }
            }
        }
    }

    public static void runAllTestV3WriteExcel(){
        Map<String,int[]> aixcoderResult1=runAllTestReturnMap("com.aixcode.autoTest.aixcoderV22","AixcoderOld","第二版模型手动生成",0,186);

        Map<String,int[]> copilotResult1=runAllTestReturnMap("com.aixcode.autoTest.generate","GenerateMethod","Copilot模型",0,103);
        Map<String,int[]> copilotResult2=runAllTestReturnMap("com.aixcode.autoTest.generate.copilot","GenerateMethod","Copilot模型",104,186);
        Map<String,int[]> copilotResult=copilotResult1;
        copilotResult.putAll(copilotResult2);
        Util.exportExcel(aixcoderResult1,copilotResult,"aixcoderXL","src/main/resources/localFile/aixcoderXL自动化测试结果.xlsx");

    }

    public static void compareModel(){

    }

    public static int[] evaluationGenerateMethod(String lineNum, String basePackage, String prefix) {
        try {
            String className="com.aixcode.autoTest.evaluation.Evaluation"+lineNum;
            Class cls=Class.forName(className);
            AbstractBaseEvaluation test= (AbstractBaseEvaluation) cls.getDeclaredConstructor(String.class,String.class).newInstance(basePackage,prefix);
            int[] res=test.evaluation();
            return res;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new int[]{0,0};
    }

}
