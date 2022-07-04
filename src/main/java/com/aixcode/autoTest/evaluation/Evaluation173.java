package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Evaluation173 extends AbstractBaseEvaluation {
    public Evaluation173(String basePackage, String prefix) {
        super(basePackage, prefix);
    }
    Map<File,String> fileMap=new HashMap<>(){
        {
            put(new File("src/main/java/com/aixcode/autoTest/Executor.java"), "java");
            put(new File("src/main/resources/tempFile/sample173.txt"), "txt");
        }
    };

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (Map.Entry<File,String> entry:fileMap.entrySet()){
            try {
                File file=entry.getKey();
                String methodExtension=entry.getValue();
                String targetExtension=solution.getFileExtension(file);
                if (targetExtension.equals(methodExtension)){
                    passCount++;
                }
            }catch (Exception e){

            }

        }
        return new int[]{passCount,fileMap.size()};
    }
}
