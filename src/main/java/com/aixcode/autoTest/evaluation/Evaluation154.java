package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Evaluation154 extends AbstractBaseEvaluation {
    public Evaluation154(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<String> resourceFileNames=new ArrayList<String>(){
        {
            add("src/main/java/com/aixcode/autoTest/Executor.java");
            add(".");
            add("/");
    }};


    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for(String fileName:resourceFileNames){
            try{
                String filePath=null;
                URL url=solution.getUrlFile(fileName);
                if (url!=null){
                    filePath=url.getPath();
                }
                if(filePath==null&&(canonicalSolutionByClassLoader(fileName)==null||canonicalSolutionDefault(fileName)==null)){
                    pass_count++;
                }else if(filePath.equals(canonicalSolutionByClassLoader(fileName))||filePath.equals(canonicalSolutionDefault(fileName))){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }

        return new int[]{pass_count,resourceFileNames.size()};
    }

    String canonicalSolutionByClassLoader(String fileName){
        if (fileName == null) {
            return null;
        }
        URL url=this.getClass().getClassLoader().getResource(fileName);
        if (url == null) {
            return null;
        }
        return url.getPath();
    }
    String canonicalSolutionDefault(String fileName){
        if (fileName == null) {
            return null;
        }
        URL url=this.getClass().getResource(fileName);
        if (url == null) {
            return null;
        }
        return url.getPath();
    }
}
