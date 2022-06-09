package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.List;

public class Evaluation85 extends AbstractBaseEvaluation {
    public static List<String> strList=new ArrayList<>(){
        {
            add("abcsdf");
            add("c");
            add("");
            add(null);
            add("safdas");
        }
    };
    public static List<String> strList2=new ArrayList<>(){
        {
            add("sdf");
            add("e");
            add("f");
            add("fdds");
            add("f");
        }
    };
    public static List<String> strList3=new ArrayList<>(){
        {
            add("abcsdf");
            add("ce");
            add("");
            add(null);
            add("safdasf");
        }
    };

    public Evaluation85(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (int i=0;i<strList.size();i++){
            String str1=strList.get(i);
            String str2=strList2.get(i);
            String str3=strList3.get(i);
            try {
                String res=solution.appendTrailing(str1, str2);
                if (res==str3||res.equals(str3)){
                    passCount++;
                }
            }catch (Exception e){
//                e.printStackTrace();
            }
        }
        return new int[]{passCount,strList.size()};
    }
}
