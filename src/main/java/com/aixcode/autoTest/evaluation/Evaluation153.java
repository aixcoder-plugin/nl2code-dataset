package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation153 extends AbstractBaseEvaluation {
    public Evaluation153(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        byte[] targetArray = new byte[]{1,2,3,4,5,6,7,8,9,0};
        Map<byte[], byte[]> mTest = new HashMap<>();
        mTest.put(new byte[]{1,2,3,4,5,6,7,8,9,0}, new byte[]{0,0,0,0,0,0,0,0,0,0});
        mTest.put(new byte[]{2,1,4,3,6}, new byte[]{3,3,7,7,3});
        mTest.put(new byte[]{127,127,127,127,127,127,127,127,127,127}, new byte[]{126,125,124,123,122,121,120,119,118,127});
        mTest.put(new byte[10], new byte[]{1,2,3,4,5,6,7,8,9,0});

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<byte[], byte[]> arrBB : mTest.entrySet()) {
            byte[] source = arrBB.getKey();
            byte[] result = arrBB.getValue();
            byte[] actualReturn;
            try {
                total_count++;
                actualReturn = solution.calculateC2(source, targetArray);
                if (actualReturn.length == result.length){
                    boolean isPass = true;
                    for(int i=0;i<actualReturn.length;i++){
                        if (actualReturn[i] != result[i]){
                            isPass = false;
                            break;
                        }
                    }
                    if(isPass){
                        pass_count++;
                    }
                }
            } catch (Exception e) {
            }
        }
        try{
            total_count++;
            byte[] actualReturn = solution.calculateC2(null, targetArray);
            if(actualReturn != null){
                if (actualReturn.length == 0){
                    pass_count++;
                }
            }else {
                pass_count++;
            }

        }catch (Exception e){

        }

        try{
            total_count++;
            byte[] actualReturn = solution.calculateC2(targetArray, null);
            if(actualReturn != null){
                if (actualReturn.length == 0){
                    pass_count++;
                }
            }else {
                pass_count++;
            }

        }catch (Exception e){

        }
        try{
            total_count++;
            byte[] actualReturn = solution.calculateC2(null, null);
            if(actualReturn != null){
                if (actualReturn.length == 0){
                    pass_count++;
                }
            }else {
                pass_count++;
            }

        }catch (Exception e){

        }
        return new int[]{pass_count, total_count};
    }
}
