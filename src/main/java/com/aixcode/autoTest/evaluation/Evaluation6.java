package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation6 extends AbstractBaseEvaluation {


    public Evaluation6(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<Short,Integer> map = new HashMap<Short,Integer>();
        map.put(Short.MAX_VALUE,0);
        map.put(Short.MIN_VALUE,0);
        map.put((short)15,2);
        map.put((short)63,3);//offset=array length-2
        map.put((short)7, 4);//offset=array length-1
        map.put((short)6, 6);// offset larger than array length
        int pass_count = 0;

        Map<Short, byte[]> ExpectedData = new HashMap<>();
        ExpectedData.put(Short.MAX_VALUE, new byte[]{127, -1, 51, 52, 53});
        ExpectedData.put(Short.MIN_VALUE, new byte[]{-128, 0, 51, 52, 53});
        ExpectedData.put((short)15,new byte[]{49,50,0,15,53});
        ExpectedData.put((short)63,new byte[]{49,50,51,0,63});
        ExpectedData.put((short)5, new byte[]{49,50,51,52,0});
        ExpectedData.put((short)7, new byte[]{49,50,51,52,53});

        for(Map.Entry<Short,Integer> entry:map.entrySet()){
            byte[] data1 = {'1','2','3','4','5'};
            try{
                Short dataTarget = entry.getKey();
                solution.putShort(data1, dataTarget, entry.getValue());
                boolean isEqual = true;
                byte[] expectedData = ExpectedData.get(dataTarget);
                for(int i=0; i<data1.length;i++) {
                    if (data1[i] != expectedData[i]) {
                        //System.out.println("data1["+i+"]="+data1[i]+" expectedData["+i+"]="+expectedData[i]);
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    pass_count++;
                }
            }catch(Exception e){
                e.printStackTrace();

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
