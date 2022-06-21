package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Puts a byte and a short into this byte vector. The byte vector is automatically enlarged if necessary.
 * public void putShort(byte[] data, byte b, short s)
 */
public class Evaluation104 extends AbstractBaseEvaluation {
    public Evaluation104(String basePackage, String prefix) {
        super(basePackage, prefix);
    }
    List<byte[]> byteList=new ArrayList<>(){{
        add(new byte[]{1,2,3});
        add(new byte[]{11});
        add(new byte[]{21,22});
        add(new byte[]{51,52,53,54,55,56});
    }};
    List<Byte> bytes=new ArrayList<>(){{
        add((byte)61);
        add((byte)71);
        add((byte)81);
        add((byte)91);
    }};
    List<Short> shorts=new ArrayList<>(){{
        add((short)101);
        add((short)102);
        add((short)103);
        add((short)104);
    }};

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (int i=0;i<byteList.size();i++){
            try {
                byte[] arr=byteList.get(i);
                Byte byteVal=bytes.get(i);
                Short shortVal=shorts.get(i);
                solution.putShort(arr,byteVal,shortVal);
                if (arr.length>=3 && arr[0]==byteVal){
                    byte high=(byte) (shortVal>>8&0xFF);
                    byte low=(byte) (shortVal&0xFF);
                    if (arr[1]==high&&arr[2]==low){
                        passCount++;
                    }else if (arr[1]==low&&arr[2]==high){
                        passCount++;
                    }
                }
            }catch (Exception e){

            }
        }
        return new int[]{passCount, byteList.size()};
    }
}
