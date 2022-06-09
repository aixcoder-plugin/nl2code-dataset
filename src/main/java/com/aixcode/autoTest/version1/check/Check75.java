package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder75;
import com.aixcode.autoTest.version1.copilot.Copilot75;


public class Check75 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot75 solution = new Copilot75();
        int pass_cunt = 0 ;
        try {
            String date = solution.readImageData("autoTest.png");
            if (null != date && date.length() > 0){
                pass_cunt ++;
            }
        }catch (Exception e) {

        }
        return new int[] {pass_cunt,1};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder75 solution = new Aixcoder75();
        int pass_cunt = 0 ;
        try {
            String date = solution.readImageData("autoTest.png");
            if (null != date && date.length() > 0){
                pass_cunt ++;
            }
        }catch (Exception e) {

        }
        return new int[] {pass_cunt,1};
    }
}
