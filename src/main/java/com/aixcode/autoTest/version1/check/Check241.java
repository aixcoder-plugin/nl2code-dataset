package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder241;
import com.aixcode.autoTest.version1.copilot.Copilot241;

public class Check241 extends BaseAbstractTest {

    public int[][] values = new int[][] {
            {21, 5, 2, -1, 1},
            {0},
            {-1,-1},
            {2,-12},
            {62, 2, -10, -2, 1, 2, -10, 1}
    };
    @Override
    public int[] checkCopilot() {
        Copilot241 solution=new Copilot241();
        int passCount=0;
        for (int i=0;i<values.length;i++){
            int[] value=values[i];
            try {
                int res=solution.random(value);
                for (int v:value) {
                    if (v==res){
                        passCount++;
                        break;
                    }
                }

            }catch (Exception e){
            }
        }
        return new int[]{passCount,values.length};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder241 solution=new Aixcoder241();
        int passCount=0;
        for (int i=0;i<values.length;i++){
            int[] value=values[i];
            try {
                int res=solution.random(value);
                for (int v:value) {
                    if (v==res){
                        passCount++;
                        break;
                    }
                }

            }catch (Exception e){
            }
        }
        return new int[]{passCount,values.length};
    }
}
