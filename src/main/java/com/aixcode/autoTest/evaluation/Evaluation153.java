package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *计算 C2 = M xor t
 * public byte[] calculateC2(byte[] m, byte[] t)
 */
public class Evaluation153 extends AbstractBaseEvaluation {
    public Evaluation153(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<byte[]> bytes1=new ArrayList<>(){{
        add(new byte[]{12});
        add(new byte[]{12});
        add(new byte[]{21,62,42,12});
        add(new byte[]{-12,52,81});
        add(new byte[]{0,0,-32});
    }};

    List<byte[]> bytes2=new ArrayList<>(){{
        add(new byte[]{31});
        add(new byte[]{12});
        add(new byte[]{42,19,52,18});
        add(new byte[]{-42,-19,-52});
        add(new byte[]{-42,0,32});
    }};

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (int i = 0; i < bytes1.size(); i++) {
            try {
                byte[] arr1 = bytes1.get(i);
                byte[] arr2 = bytes2.get(i);
                byte[] res = solution.calculateC2(arr1, arr2);
                boolean equals = true;
                for (int j = 0; j < arr1.length; j++) {
                    if ((arr1[j] ^ arr2[j]) != res[j]) {
                        equals = false;
                    }
                }
                if (equals) {
                    passCount++;
                }
            } catch (Exception e) {

            }
        }

        return new int[]{passCount, bytes1.size()};
    }
}
