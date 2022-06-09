package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder77;
import com.aixcode.autoTest.version1.copilot.Copilot77;

import java.util.Arrays;

public class Check77 extends BaseAbstractTest {

    @Override
    public int[] checkCopilot() {
        Copilot77 solution=new Copilot77();
        int passCount=0;
        Object[] value11=new Object[]{1,2,3};
        Object[] value12=new Object[]{1,2,3};
        Object[] value13=new Object[]{1,2,3,1,2,3};
        try {
            Object[] value14=solution.concat(value11,value12);
            if (Arrays.equals(value13,value14)){
                passCount++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Object[] value21=new Object[]{"1","2","3"};
        Object[] value22=new Object[]{"1","2","3"};
        Object[] value23=new Object[]{"1","2","3","1","2","3"};
        try {
            Object[] value24=solution.concat(value21,value22);
            if (Arrays.equals(value23,value24)){
                passCount++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        Object[] value31=new Object[]{33,false,true};
        Object[] value32=new Object[]{"new Date()",false,'a'};
        Object[] value33=new Object[]{33,false,true,"new Date()",false,'a'};
        try {
            Object[] value34=solution.concat(value31,value32);
            if (Arrays.equals(value33,value34)){
                passCount++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return new int[]{passCount,3};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder77 solution=new Aixcoder77();
        int passCount=0;
        Object[] value11=new Object[]{1,2,3};
        Object[] value12=new Object[]{1,2,3};
        Object[] value13=new Object[]{1,2,3,1,2,3};
        try {
            Object[] value14=solution.concat(value11,value12);
            if (Arrays.equals(value13,value14)){
                passCount++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Object[] value21=new Object[]{"1","2","3"};
        Object[] value22=new Object[]{"1","2","3"};
        Object[] value23=new Object[]{"1","2","3","1","2","3"};
        try {
            Object[] value24=solution.concat(value21,value22);
            if (Arrays.equals(value23,value24)){
                passCount++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        Object[] value31=new Object[]{33,false,true};
        Object[] value32=new Object[]{"new Date()",false,'a'};
        Object[] value33=new Object[]{33,false,true,"new Date()",false,'a'};
        try {
            Object[] value34=solution.concat(value31,value32);
            if (Arrays.equals(value33,value34)){
                passCount++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return new int[]{passCount,3};
    }
}
