package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Evaluation57 extends AbstractBaseEvaluation {
    List<String> list = new ArrayList<>(){
        {
            add("path11"+ File.pathSeparator);
            add("");
            add("path13");
        }
    };
    List<String> list2=new ArrayList<>(){
        {
            add(File.pathSeparator+"path21");
            add(File.pathSeparator+"path22");
            add(File.pathSeparator+"path23");
        }
    };
    List<String> expected = new ArrayList<>(){
        {
            add("path11"+ File.pathSeparator);
            add(File.pathSeparator+"path22");
            add("path13"+File.pathSeparator+"path23");
        }
    };

    public Evaluation57(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (int i=0;i<list.size();i++){
            String value=list.get(i);
            String value2=list2.get(i);
            String value3=expected.get(i);
            try {
                if (solution.joinPath(value,value2).equals(value3)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list.size()};
    }
}
