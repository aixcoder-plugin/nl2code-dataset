package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Evaluation83 extends AbstractBaseEvaluation {

    public Evaluation83(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private static List<String> getFiles(String dir){
        File file=new File(dir);
        List<String> entityList=new ArrayList<>();
        if (file.exists()){
            for (File f:file.listFiles()){
                entityList.add(f.getName());
            }
        }
        Collections.sort(entityList);
        return entityList;
    }

    public static void main(String[] args) {
        String dir="src/main/com/aixcode/resource/tempFile";
        List<String> fileList=getFiles(dir);
        Collections.sort(fileList);
        System.out.println(fileList);
    }

    @Override
    public int[] evaluation() {
        int passCount=0;
        try {
            String dir="src/main/com/aixcode/resource/tempFile";
            List<String> fileList=solution.getFiles(dir);
            if (fileList!=null){
                Collections.sort(fileList);
                List<String> fileList2=getFiles(dir);
                if (fileList.size()==fileList2.size()){
                    boolean pass=true;
                    for (int i=0;i<fileList.size();i++){
                        if (!fileList.get(i).equals(fileList2.get(i))){
                            pass=false;
                        }
                    }
                    if (pass){
                        passCount++;
                    }
                }

            }
        }catch (Exception e){

        }

        return new int[]{passCount,1};
    }
}
