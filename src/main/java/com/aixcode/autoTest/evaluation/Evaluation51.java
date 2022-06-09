package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation51 extends AbstractBaseEvaluation {


    public Evaluation51(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        byte[] k0 = new byte[2];
        byte[] k1 = {1,5,6,9};
        byte[] k2 = {'a','b','c','d'};
        byte[] k3 = {'a'};
        byte[] k4 = {1} ;
        byte[] k5 = null;
        byte[] k6 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int pass_count = 0;
        int total_count = 7;
        try {
            if(solution.hashCode(k0) == 0){
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            if(solution.hashCode(k1) == 34791){
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            if(solution.hashCode(k2) == 2987074){
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            if(solution.hashCode(k3) == 'a'){
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            if(solution.hashCode(k4) == 1){
                pass_count++;
            }
        } catch (Exception e) {

        }
        try {
            solution.hashCode(k5);
            pass_count++;
        } catch (Exception e) {

        }

        try {
            if(solution.hashCode(k6) > 0){
                pass_count++;
            }
        } catch (Exception e) {

        }

        return new int[]{pass_count,total_count};
    }
}
