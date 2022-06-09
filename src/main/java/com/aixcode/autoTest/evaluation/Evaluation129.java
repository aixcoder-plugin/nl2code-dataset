package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Evaluation129 extends AbstractBaseEvaluation {
    public Evaluation129(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int[] arrTestInput = new int[]{1, 60, -1, -60, 0, 1440};
        int pass_count = 0;
        for (int iMin : arrTestInput) {
            try {
                String strOutput = solution.getNowDate(iMin);
                Calendar cExpectedResult = Calendar.getInstance();
                cExpectedResult.add(Calendar.MINUTE,iMin);
                String expected = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cExpectedResult.getTime());
                if (isSame(strOutput, expected)) {
                    pass_count++;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return new int[]{pass_count,arrTestInput.length};
    }

    private boolean isSame(String output, String expected) {
        boolean bSame = true;
        if(output == null && expected == null){
            return true;
        }
        if(output.length() != expected.length()) {
            bSame = false;
        }
        for(int i=0;i<output.length()-2;i++) {
            if(output.charAt(i) != expected.charAt(i)) {
                bSame = false;
                break;
            }
        }
        return bSame;
    }
}
