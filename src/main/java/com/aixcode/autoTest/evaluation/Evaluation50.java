package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation50 extends AbstractBaseEvaluation {


    public Evaluation50(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
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
            String hexString = solution.bytesToHexString(k0);
            if(hexString.equals("0000")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHexString(k1);
            if(hexString.equals("0b0c0e0f")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHexString(k2);
            if(hexString.equals("6162797a")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHexString(k3);
            if(hexString.equals("61")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHexString(k4);
            if(hexString.equals("01")) {
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            String hexString = solution.bytesToHexString(k5);
            if(hexString == null) {
                pass_count++;
            }
        } catch (Exception e) {

        }

        try {
            String hexString = solution.bytesToHexString(k6);
            if(hexString == null) {
                pass_count++;
            }
        } catch (Exception e) {
        }

        return new int[]{pass_count,total_count};
    }
}
