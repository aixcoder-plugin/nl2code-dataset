package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Returns a hash code value for this bit array.
 * public int hashCode(byte[] byteArr)
 */
public class Evaluation51 extends AbstractBaseEvaluation {


    public Evaluation51(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<byte[]> byteArrList=new ArrayList<>(){{
        add(new byte[]{1,23,5,29,10});
        add(new byte[]{13,22,93,78});
        add(new byte[]{31,25,92});
        add(new byte[]{10});
    }};

    @Override
    public int[] evaluation() {
        try {
            Set<Integer> resSet = new HashSet<>();
            for(int i=0;i<byteArrList.size();i++){
                resSet.add(solution.hashCode(byteArrList.get(i)));
            }
            if (resSet.size()>1){//can not return constant value
                return new int[]{1,1};
            }
        }catch (Exception e){

        }
        return new int[]{0,1};
    }
}
