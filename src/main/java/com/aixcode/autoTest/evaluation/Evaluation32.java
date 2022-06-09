package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation32 extends AbstractBaseEvaluation {


    public Evaluation32(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
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
