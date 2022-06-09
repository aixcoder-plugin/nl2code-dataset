package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder315;
import com.aixcode.autoTest.version1.copilot.Copilot315;

public class Check315 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot315 solution=new Copilot315();
        double[][] ds = new double[10][10];
        // first row un-prefilled
        ds[1] = new double[]{1.011, 2.13, 32.2, 112.202, 212.44, 22.939, 6.56, 62.01, 10.63, 90.06}; //prefilled with doubles
        ds[2] = new double[]{111.011, 222.13, 333.2, 444.202}; // prefilled with array that length < 10
        ds[3] = new double[]{1,2,3,4,5,6,7,8,9,10}; // pre-filled with integers
        ds[4] = new double[]{1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f,10.01f}; // pre-filled with floats
        int pass_count = 0;
        int total_count = 0;

        for(double[] arrTest : ds){
            total_count++;
            try{
                double[] arrTmp = arrTest.clone();
                solution.fillMatrix_1D(arrTest);
                boolean isFilled = false;
                for (int i=0; i<arrTest.length; i++){
                    //System.out.println(arrTest[i] + ";" + arrTmp[i]);
                    if(arrTest[i] != arrTmp[i]){
                        isFilled = true;
                    }
                }
                if(isFilled){
                    pass_count++;
                }
            }catch(Exception e){
                //e.printStackTrace();
            }
        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder315 solution=new Aixcoder315();
        double[][] ds = new double[10][10];
        // first row un-prefilled
        ds[1] = new double[]{1.011, 2.13, 32.2, 112.202, 212.44, 22.939, 6.56, 62.01, 10.63, 90.06}; //prefilled with doubles
        ds[2] = new double[]{111.011, 222.13, 333.2, 444.202}; // prefilled with array that length < 10
        ds[3] = new double[]{1,2,3,4,5,6,7,8,9,10}; // pre-filled with integers
        ds[4] = new double[]{1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f,10.01f}; // pre-filled with floats
        int pass_count = 0;
        int total_count = 0;

        for(double[] arrTest : ds){
            total_count++;
            try{
                double[] arrTmp = arrTest.clone();
                solution.fillMatrix_1D(arrTest);
                boolean isFilled = false;
                for (int i=0; i<arrTest.length; i++){
                    //System.out.println(arrTest[i] + ";" + arrTmp[i]);
                    if(arrTest[i] != arrTmp[i]){
                        isFilled = true;
                    }
                }
                if(isFilled){
                    pass_count++;
                }
            }catch(Exception e){
                //e.printStackTrace();
            }
        }

        return new int[]{pass_count,total_count};
    }
}
