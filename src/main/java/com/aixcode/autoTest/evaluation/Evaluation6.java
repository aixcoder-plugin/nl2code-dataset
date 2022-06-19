package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * put a short value into a byte array with specific offset
 * public void putShort(byte[] data, short value, int offset)
 */
public class Evaluation6 extends AbstractBaseEvaluation {


    public Evaluation6(String basePackage, String prefix) {
        super(basePackage, prefix);
    }
    List<byte[]> byteArrList=new ArrayList<>(){{
        add(new byte[]{1,5,2,3,10});
        add(new byte[]{2,5,13,21,73});
        add(new byte[]{31,52,24,5,84,46,31});
        add(new byte[]{32,12});
    }};
    List<Short> shorts=new ArrayList<>(){{
        add((short)129);
        add((short)1045);
        add((short)11111);
        add((short)65533);

    }};
    List<Integer> indexs=new ArrayList<>(){{
        add(1);
        add(0);
        add(5);
        add(0);
    }};

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for(int i=0;i< byteArrList.size();i++){
            try {
                byte[] byteArr = byteArrList.get(i);
                short shortVal = shorts.get(i);
                int index = indexs.get(i);
                solution.putShort(byteArr,shortVal,index);
                byte high=(byte)(shortVal>>8&0xFF);
                byte low = (byte) (shortVal & 0xFF);
                if (byteArr[index] == high && byteArr[index + 1] == low) {
                    passCount++;
                }else if(byteArr[index]==low&&byteArr[index+1]==high){
                    passCount++;
                }
            }catch (Exception e){

            }
        }
        return new int[]{passCount, byteArrList.size()};
    }
}
