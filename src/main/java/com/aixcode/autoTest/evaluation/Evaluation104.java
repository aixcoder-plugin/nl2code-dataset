package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation104 extends AbstractBaseEvaluation {
    public Evaluation104(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        byte[] bs1 = {2};
        byte[] bs2 = {2,3,54,6};
        byte[] bs3 = {2,3,4,4};
        byte[] bs4 = {2,3,4,5};
        byte[] bs5 = {2,3,4,5,6};
        Map<byte[], Byte> map = new HashMap<byte[], Byte>(){{
            put(bs1,(byte)1);
            put(bs2,(byte)2);
            put(bs3,(byte)3);
            put(bs4,(byte)4);
            put(bs5,(byte)5);
        }};

        for (Map.Entry<byte[],Byte> entry : map.entrySet()){
            try {
                solution.putShort(entry.getKey(), entry.getValue(), (short) 3);
                if (entry.getKey()[0] == entry.getValue() && (entry.getKey()[1] ==3 || 3 == entry.getKey()[2])&& (entry.getKey()[1] ==0 || 0 == entry.getKey()[2])){
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        return new int[]{pass_count,map.size()};
    }
}
