package com.aixcode.autoTest;

import java.util.List;
import java.util.stream.Collectors;

import static com.aixcode.autoTest.Util.listFiles;

public class Excutor {
    public static void main(String[] args) {
        try {
            //执行的line_num,只需要修改这个值即可
            String line_num="153";
            evaluationOneExample("com.aixcode.autoTest.generate","GenerateMethod",line_num);

//            runAllTestV2("main.com.aixcode.autoTest.generate.copilot","GenerateMethod","Copilot模型",104,186);
//            runAllTestV2("main.com.aixcode.autoTest.generate.aixcoder","Aixcoder","Aixcoder模型",104,186);


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






    public static double[] runAllTestV2(String basePackage,String prefix,String message,int minFileId,int maxFileId){
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
//            System.out.println(message+"模型测试结果：部分通过归一化求和:"+copilot_score+"  完全通过的测试用例数:"+CopilotExacttCount);
//            System.out.println("totalCount:"+totalCount);
            return new double[]{copilot_score,CopilotExacttCount,totalCount};
        }catch (Exception e){
            e.printStackTrace();
        }
        return new double[]{0,0,0};
    }

    public static int[] evaluationGenerateMethod(String lineNum, String basePackage, String prefix) {
        try {
            //执行的line_num,只需要修改这个值即可
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
