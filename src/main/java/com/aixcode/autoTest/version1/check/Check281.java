package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder281;
import com.aixcode.autoTest.version1.copilot.Copilot281;

public class Check281 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot281 solution=new Copilot281();
        int[] arrTest = {10,20,33,322,404,515,663,774,288,199};
        int[] arrTest2 = {12,12,12,12,12};

        int pass_count = 0;
        int total_count = 0;

        for(int i = 0; i < arrTest.length; i++){
            total_count++;
            try{
                if(solution.indexOf(arrTest, arrTest[i]) == i){
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        // {12,12,12,12,12} return index should be 0 for the first occurance
        for(int i = 0; i < arrTest2.length; i++){
            total_count++;
            try{
                if(solution.indexOf(arrTest2, arrTest2[i]) == 0){
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        // for not found, return -1
        try {
            total_count++;
            if(solution.indexOf(arrTest, 100) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // for null input, return -1
        try {
            total_count++;
            if(solution.indexOf(null, -1) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder281 solution=new Aixcoder281();
        int[] arrTest = {10,20,33,322,404,515,663,774,288,199};
        int[] arrTest2 = {12,12,12,12,12};

        int pass_count = 0;
        int total_count = 0;

        for(int i = 0; i < arrTest.length; i++){
            total_count++;
            try{
                if(solution.indexOf(arrTest, arrTest[i]) == i){
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        // {12,12,12,12,12} return index should be 0 for the first occurance
        for(int i = 0; i < arrTest2.length; i++){
            total_count++;
            try{
                if(solution.indexOf(arrTest2, arrTest2[i]) == 0){
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        // for not found, return -1
        try {
            total_count++;
            if(solution.indexOf(arrTest, 100) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // for null input, return -1
        try {
            total_count++;
            if(solution.indexOf(null, -1) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return new int[]{pass_count,total_count};
    }
}
