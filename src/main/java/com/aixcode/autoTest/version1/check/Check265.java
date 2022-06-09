package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder265;
import com.aixcode.autoTest.version1.copilot.Copilot265;

public class Check265 extends BaseAbstractTest {
    public static int[][] data=new int[][]{
        {1,20},
        {2,100},
        {3,4},
        {4,4},
        {5,10}
    };
    @Override
    public int[] checkCopilot() {
        Copilot265 solution=new Copilot265();
        int passCount=0;
        for (int i=0;i<data.length;i++){
            int[] d=data[i];
            int origin=d[0];
            int bound=d[1];
            try {
                int res=solution.randomInt(origin, bound);
                if (res>=origin&&res<bound){
                    passCount+=1;
                }
            }catch (Exception e){

            }

        }

        return new int[]{passCount,5};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder265 solution=new Aixcoder265();
        int passCount=0;
        for (int i=0;i<data.length;i++){
            int[] d=data[i];
            int origin=d[0];
            int bound=d[1];
            try {
                int res=solution.randomInt(origin, bound);
                if (res>=origin&&res<bound){
                    passCount+=1;
                }
            }catch (Exception e){

            }

        }
        return new int[]{passCount,5};
    }
}
