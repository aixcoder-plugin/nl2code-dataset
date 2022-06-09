package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;

public class Evaluation115 extends AbstractBaseEvaluation {

    public Evaluation115(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<long[]> list =new ArrayList<>(){{
        add(new long[]{1,2,4,21});
        add(new long[]{0,0,0,0,0,0,0});
        add(new long[]{3});
        add(new long[]{4,-1,-1});
    }};
    List<String[]> list2=new ArrayList<>(){{
        add(new String[]{"1","2","4","21"});
        add(new String[]{"0","0","0","0","0","0","0"});
        add(new String[]{"3"});
        add(new String[]{"4","-1","-1"});
    }};

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for (int i=0;i<list.size();i++){
            try {
                long[] a=list.get(i);
                String[] b=list2.get(i);
                String[] methodRes=solution.toTimestampStrs(a);
                if (Arrays.equals(methodRes,b)){
                    pass_count++;
                }
            }catch (Exception e) {

            }

        }
        return new int[]{pass_count,list.size()};
    }
}
