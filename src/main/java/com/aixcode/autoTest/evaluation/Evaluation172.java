package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Evaluation172 extends AbstractBaseEvaluation {
    public Evaluation172(String basePackage, String prefix) {
        super(basePackage, prefix);
    }
    List<String> list1=new ArrayList<>(){
        {
            add("1329");
            add("75129715097198472");
            add("4123749187989174982");
            add("-1249479293");
            add("-4123749187982731474982");
        }
    };
    List<String> list2=new ArrayList<>(){
        {
            add("235");
            add("413134241");
            add("423472394729374219742932739");
            add("2304203948029348023");
            add("-423472394729374219742932739");
        }
    };
    List<String> list3=new ArrayList<>(){
        {
            add("1094");
            add("75129714684064231");
            add("-423472390605625031753757757");
            add("-2304203949278827316");
            add("423468270980186237011457757");
        }
    };

    @Override
    public int[] evaluation() {
        int passCount = 0;

        for (int i = 0; i < list1.size(); i++) {
            String str1 = list1.get(i);
            String str2 = list2.get(i);
            String target = list3.get(i);
            try {
                String methodRes = solution.bigDecimalSubtract(str1, str2);
                if (target.equals(methodRes)) {
                    passCount++;
                }
            } catch (Exception e) {

            }

        }
        return new int[]{passCount, list1.size()};
    }

    public static void main(String[] args) {
        BigInteger bigInteger=new BigInteger("-4123749187982731474982");
        BigInteger bigInteger1=new BigInteger("-423472394729374219742932739");
        BigInteger res=bigInteger.subtract(bigInteger1);

        System.out.println(res.toString());
    }
}
