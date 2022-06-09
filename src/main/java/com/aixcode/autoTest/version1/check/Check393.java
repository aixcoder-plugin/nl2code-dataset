package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder393;
import com.aixcode.autoTest.version1.copilot.Copilot393;

public class Check393 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot393 solution=new Copilot393();
        byte[] k0 = new byte[2];
        byte[] k1 = {11,12,14,15};
        byte[] k2 = {'a','b','y','z'};
        byte[] k3 = {'a'};
        byte[] k4 = {1} ;
        byte[] k5 = null;
        byte[] k6 = new byte[0];
        int pass_count = 0;
        int total_count = 7;
        try {
            String hexString = solution.bytesToHex(k0);
            if(hexString.equals("0000")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k1);
            if(hexString.equals("0b0c0e0f")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k2);
            if(hexString.equals("6162797a")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k3);
            if(hexString.equals("61")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k4);
            if(hexString.equals("01")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k5);
            if(hexString == null) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            String hexString = solution.bytesToHex(k6);
            if(hexString == null) {
                pass_count++;
            }
        } catch (Exception e) {
        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder393 solution=new Aixcoder393();
        byte[] k0 = new byte[2];
        byte[] k1 = {11,12,14,15};
        byte[] k2 = {'a','b','y','z'};
        byte[] k3 = {'a'};
        byte[] k4 = {1} ;
        byte[] k5 = null;
        byte[] k6 = new byte[0];
        int pass_count = 0;
        int total_count = 7;
        try {
            String hexString = solution.bytesToHex(k0);
            if(hexString.equals("0000")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k1);
            if(hexString.equals("0b0c0e0f")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k2);
            if(hexString.equals("6162797a")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k3);
            if(hexString.equals("61")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k4);
            if(hexString.equals("01")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHex(k5);
            if(hexString == null) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            String hexString = solution.bytesToHex(k6);
            if(hexString == null) {
                pass_count++;
            }
        } catch (Exception e) {
        }

        return new int[]{pass_count,total_count};
    }
}
