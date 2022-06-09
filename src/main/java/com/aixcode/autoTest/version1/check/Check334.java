package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder334;
import com.aixcode.autoTest.version1.copilot.Copilot334;

public class Check334 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot334 solution=new Copilot334();
        int[] arrTest = {10,20,33,322,404,515,663,774,288,199};
        int[] arrTest2 = {12,12,12,12,12};

        int pass_count = 0;
        int total_count = 0;

        for(int i = 0; i < arrTest.length; i++){
            total_count++;
            try{
                if(solution.linearSearch(arrTest, arrTest[i]) == i){
                    pass_count++;
                }
            }catch(Exception e){
                //e.printStackTrace();
            }
        }
        // {12,12,12,12,12} return index should be 0 for the first occurance
        for(int i = 0; i < arrTest2.length; i++){
            total_count++;
            try{
                if(solution.linearSearch(arrTest2, arrTest2[i]) == 0){
                    pass_count++;
                }
            }catch(Exception e){
                //e.printStackTrace();
            }
        }

        // for not found, return -1
        try {
            total_count++;
            if(solution.linearSearch(arrTest, 100) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            //e.printStackTrace();
        }

        // for null input, return -1
        try {
            total_count++;
            if(solution.linearSearch(null, -1) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            //System.out.println(e.getMessage());
        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder334 solution=new Aixcoder334();
        int[] arrTest = {10,20,33,322,404,515,663,774,288,199};
        int[] arrTest2 = {12,12,12,12,12};

        int pass_count = 0;
        int total_count = 0;

        for(int i = 0; i < arrTest.length; i++){
            total_count++;
            try{
                if(solution.linearSearch(arrTest, arrTest[i]) == i){
                    pass_count++;
                }
            }catch(Exception e){
                //e.printStackTrace();
            }
        }
        // {12,12,12,12,12} return index should be 0 for the first occurance
        for(int i = 0; i < arrTest2.length; i++){
            total_count++;
            try{
                if(solution.linearSearch(arrTest2, arrTest2[i]) == 0){
                    pass_count++;
                }
            }catch(Exception e){
                //e.printStackTrace();
            }
        }

        // for not found, return -1
        try {
            total_count++;
            if(solution.linearSearch(arrTest, 100) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            //e.printStackTrace();
        }

        // for null input, return -1
        try {
            total_count++;
            if(solution.linearSearch(null, -1) == -1) {
                pass_count++;
            }
        }catch (Exception e){
            //System.out.println(e.getMessage());
        }

        return new int[]{pass_count,total_count};
    }
}
