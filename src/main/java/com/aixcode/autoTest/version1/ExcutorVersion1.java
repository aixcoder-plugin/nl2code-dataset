package com.aixcode.autoTest.version1;

import java.util.List;
import java.util.stream.Collectors;

import static com.aixcode.autoTest.Util.listFiles;

public class ExcutorVersion1 {
    private static void runAllTest(){
        try {
            List<String> fileNames=listFiles("src/main/com/aixcode/autoTest/check");
            List<String> fileIds=fileNames.stream().map(fileName->fileName.substring("Check".length(),fileName.lastIndexOf("."))).collect(Collectors.toList());

            double copilot_score=0;
            double aixcoder_score=0;
            int CopilotExacttCount=0;
            int AixcoderExacttCount=0;
            for(String fileId:fileIds){
                int[] result=checkCopilot(fileId);
                if (result!=null&&result.length==2&&result[1]!=0){
                    copilot_score+=(double) result[0]/result[1];
                    if (result[0]==result[1]){
                        CopilotExacttCount++;
                    }
                }
            }

            for(String fileId:fileIds){
                int[] result=checkAixcoder(fileId);
                if (result!=null&&result.length==2&&result[1]!=0){
                    aixcoder_score+=(double) result[0]/result[1];
                    if (result[0]==result[1]){
                        AixcoderExacttCount++;
                    }
                }
            }
            System.out.println("Copilot部分通过归一化求和:"+copilot_score+"      Copilot完全通过的测试用例数:"+CopilotExacttCount);
            System.out.println("Aixcoder部分通过归一化求和:"+aixcoder_score+"    Aixcoder完全通过的测试用例数:"+AixcoderExacttCount);
            System.out.println("totalCount:"+fileNames.size());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int[] checkCopilot(String lineNum) {
        try {
            //执行的line_num,只需要修改这个值即可
            String className="main.com.aixcode.autoTest.check.Check"+lineNum;
            Class cls=Class.forName(className);
            BaseAbstractTest test= (BaseAbstractTest) cls.getDeclaredConstructor().newInstance();
            int[] res=test.checkCopilot();
            return res;
        }catch (Exception e){
//            e.printStackTrace();
        }
        return new int[]{0,0};
    }

    public static int[] checkAixcoder(String lineNum) {
        try {
            //执行的line_num,只需要修改这个值即可
            String className="main.com.aixcode.autoTest.check.Check"+lineNum;
            Class cls=Class.forName(className);
            BaseAbstractTest test= (BaseAbstractTest) cls.getDeclaredConstructor().newInstance();
            int[] res=test.checkAixcoder();
            return res;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new int[]{0,0};
    }
}
