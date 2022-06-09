package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder32;
import com.aixcode.autoTest.version1.copilot.Copilot32;

public class Check32 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot32 solution=new Copilot32();
        int[] arrTest = {10,20,33,322,404};// the first is minimum
        int[] arrTest1 = {10,0,33,322,-404};// the last is minimum
        int[] arrTest2 = {10,10,1,322,304};// middle one is minimum
        int[] arrTest3 = {12,12,12,12,12};// anyone is minimum
        int[] arrTest4 = {1};// the only one is minimum


        int pass_count = 0;
        int total_count = 0;

        total_count++;
        try {
            if(solution.min(arrTest) == 10){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        total_count++;
        try {
            if(solution.min(arrTest1) == -404){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        total_count++;
        try {
            if(solution.min(arrTest2) == 1){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        total_count++;
        try {
            if(solution.min(arrTest3) == 12){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        total_count++;
        try {
            if(solution.min(arrTest4) == 1){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return new int[]{pass_count,total_count};

    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder32 solution = new Aixcoder32();
        int[] arrTest = {10,20,33,322,404};// the first is minimum
        int[] arrTest1 = {10,0,33,322,-404};// the last is minimum
        int[] arrTest2 = {10,10,1,322,304};// middle one is minimum
        int[] arrTest3 = {12,12,12,12,12};// anyone is minimum
        int[] arrTest4 = {1};// the only one is minimum


        int pass_count = 0;
        int total_count = 0;

        total_count++;
        try {
            if(solution.min(arrTest) == 10){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        total_count++;
        try {
            if(solution.min(arrTest1) == -404){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        total_count++;
        try {
            if(solution.min(arrTest2) == 1){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        total_count++;
        try {
            if(solution.min(arrTest3) == 12){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        total_count++;
        try {
            if(solution.min(arrTest4) == 1){
                pass_count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return new int[]{pass_count,total_count};

    }
}
