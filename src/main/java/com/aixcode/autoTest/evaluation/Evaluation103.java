package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.List;

public class Evaluation103 extends AbstractBaseEvaluation {
    List<Double> list = new ArrayList<Double>(){
        {
            add(1.0/3.0);
            add(2.00002);
            add(0.000015);
            add(-0.000015);
            add(0.0);
        }
    };
    List<Double> list2 = new ArrayList<Double>(){
        {
            add(1.0/3.0);
            add(2.0);
            add(0.00001);
            add(0.00001);
            add(0.0001);
        }
    };
    List<Boolean> list3 = new ArrayList<Boolean>(){
        {
            add(true);
            add(false);
            add(true);
            add(false);
            add(false);
        }
    };

    public Evaluation103(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for(int i=0;i<list.size();i++){
            try{
                if(solution.equals(list.get(i),list2.get(i),1e-5) == list3.get(i)){
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return new int[]{pass_count,list.size()};
    }
}
