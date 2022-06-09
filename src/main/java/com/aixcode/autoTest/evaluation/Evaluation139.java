package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Evaluation139 extends AbstractBaseEvaluation {
    public Evaluation139(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        Map<String, Integer> lsTestData = new HashMap<>();
        lsTestData.put("public void testMethod(int i)", 1);
        lsTestData.put("public void testMethod(Object o, String s, Integer i)", 3);
        lsTestData.put("public void testMethod()", 0);
        lsTestData.put("public void testMethod(Map<String, Object> m, List<String> lst)", 2);
        lsTestData.put("public void testMethod(int[] i, double[] d, byte[] b)", 3);
        lsTestData.put(null, 0);

        int pass_count = 0;
        int total_count = lsTestData.size();

        for(Map.Entry<String, Integer> testData : lsTestData.entrySet()) {
            Type[] actualReturn = null;
            try {
                actualReturn = solution.getArgumentTypes(testData.getKey());
                if(testData.getKey() == null) {
                    if(actualReturn == null ) {
                        pass_count++;
                    }else {
                        if(actualReturn.length == 0){
                            pass_count++;
                        }
                    }
                }
                else if (actualReturn != null && actualReturn.length == testData.getValue()) {
                    pass_count++;
                } else {
                    System.out.println("Expected: " + testData.getKey() + ", Actual: " + actualReturn);
                }
            } catch (Exception e) {
            }
        }
        return new int[]{pass_count, total_count};
    }
}
