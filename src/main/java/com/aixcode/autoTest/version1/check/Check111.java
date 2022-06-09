package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder111;
import com.aixcode.autoTest.version1.copilot.Copilot111;

public class Check111 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot111 solution=new Copilot111();
        int[] arrTest = {10,20,33,322,404};// the first is minimum
        int[] arrTest1 = {10,0,33,322,-404};// the last is minimum
        int[] arrTest2 = {10,10,1,322,304};// middle one is minimum
        int[] arrTest3 = {12,12,12,12,12};// anyone is minimum
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
        }

        return new int[]{pass_count,total_count};

    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder111 solution=new Aixcoder111();
        int[] arrTest = {10,20,33,322,404};// the first is minimum
        int[] arrTest1 = {10,0,33,322,-404};// the last is minimum
        int[] arrTest2 = {10,10,1,322,304};// middle one is minimum
        int[] arrTest3 = {12,12,12,12,12};// anyone is minimum
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
        }

        return new int[]{pass_count,total_count};

    }

}
