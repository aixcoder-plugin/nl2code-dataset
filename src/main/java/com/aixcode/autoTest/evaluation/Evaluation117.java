package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;

public class Evaluation117 extends AbstractBaseEvaluation {

    public Evaluation117(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<byte[]> byteList=new ArrayList<>(){{
        add(new byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25});
        add(new byte[]{8,9,13,21,23});
        add(new byte[]{21,12,34,85});
        add(new byte[]{});
    }};
    List<Integer> posList=new ArrayList<>(){{
        add(10);
        add(0);
        add(4);
        add(0);
    }};
    List<Integer> countList=new ArrayList<>(){{
        add(5);
        add(12);
        add(1);
        add(0);
    }};

    List<byte[]> targetList=new ArrayList<>(){{
        add(new byte[]{11,12,13,14,15});
        add(new byte[]{8,9,13,21,23});
        add(null);
        add(new byte[]{});
    }};

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for (int i = 0; i < byteList.size(); i++) {
            try {
                byte[] origin = byteList.get(i);
                byte[] target = targetList.get(i);
                int pos = posList.get(i);
                int count = countList.get(i);
                byte[] result = solution.subBytes(origin, pos, count);
                if(target==null||target.length==0){
                    if(result==null||result.length==0){
                        pass_count++;
                    }
                }else if (Arrays.equals(result, target)) {
                    pass_count++;
                }
            } catch (Exception ex) {

            }
        }
        return new int[]{pass_count,byteList.size()};
    }
}
