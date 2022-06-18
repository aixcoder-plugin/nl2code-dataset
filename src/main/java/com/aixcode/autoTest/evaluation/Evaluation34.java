package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation34 extends AbstractBaseEvaluation {


    public Evaluation34(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int[] arrTest = {10,20,33,322,404};// sorted ascending
        int[] arrTest1 = {9,8,7,6,5};// sorted descending
        int[] arrTest2 = {10,10,1,-2,304};// unsorted
        int[] arrTest3 = {12,12,12,12,12};// anyone is the same
        int[] arrTest4 = {1};// the only one is minimum


        int pass_count = 0;
        int total_count = 0;

        total_count++;
        try {
            solution.sortServers(arrTest);
            int i = 0 ;
            boolean bflag = true;
            while (i < arrTest.length - 1) {
                if (arrTest[i] > arrTest[i + 1]) {
                    bflag = false;
                    break;
                }else {
                    i++;
                }
            }
            if(bflag){
                pass_count++;
            }
        }catch (Exception e){
        }

        total_count++;
        try {
            solution.sortServers(arrTest1);
            int i = 0 ;
            boolean bflag = true;
            while (i < arrTest.length - 1) {
                if (arrTest[i] > arrTest[i + 1]) {
                    bflag = false;
                    break;
                }else {
                    i++;
                }
            }
            if(bflag){
                pass_count++;
            }
        }catch (Exception e){
        }

        total_count++;
        try {
            solution.sortServers(arrTest2);
            int i = 0 ;
            boolean bflag = true;
            while (i < arrTest.length - 1) {
                if (arrTest[i] > arrTest[i + 1]) {
                    bflag = false;
                    break;
                }else {
                    i++;
                }
            }
            if(bflag){
                pass_count++;
            }
        }catch (Exception e){
        }

        total_count++;
        try {
            solution.sortServers(arrTest3);
            int i = 0 ;
            boolean bflag = true;
            while (i < arrTest.length - 1) {
                if (arrTest[i] > arrTest[i + 1]) {
                    bflag = false;
                    break;
                }else {
                    i++;
                }
            }
            if(bflag){
                pass_count++;
            }
        }catch (Exception e){
        }

        total_count++;
        try {
            solution.sortServers(arrTest4);
            int i = 0 ;
            boolean bflag = true;
            while (i < arrTest.length - 1) {
                if (arrTest[i] > arrTest[i + 1]) {
                    bflag = false;
                    break;
                }else {
                    i++;
                }
            }
            if(bflag){
                pass_count++;
            }
        }catch (Exception e){
        }

        return new int[]{pass_count,total_count};
    }
}
