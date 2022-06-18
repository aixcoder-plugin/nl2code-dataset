package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.nio.ByteBuffer;

public class Evaluation169 extends AbstractBaseEvaluation {
    public Evaluation169(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        try {
           ByteBuffer buffer1= ByteBuffer.allocate(1024);
           buffer1.putDouble(1.0);
           ByteBuffer buffer2= ByteBuffer.allocate(24);
           buffer2.putFloat(1.0f);
           ByteBuffer buffer3= ByteBuffer.allocate(4);
           buffer3.putInt(1);
           ByteBuffer[] bufferArray=new ByteBuffer[]{buffer1,buffer2,buffer3};
           long remain=solution.remaining(bufferArray);
           if (remain==buffer1.remaining()+buffer2.remaining()+buffer3.remaining()) {
                passCount++;
           }
        }catch (Exception e){

        }
        return new int[]{passCount,1};
    }
}
