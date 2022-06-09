package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder273;
import com.aixcode.autoTest.version1.copilot.Copilot273;

import java.util.ArrayList;
import java.util.List;

public class Check273 extends BaseAbstractTest {
    List<Integer> values = new ArrayList<>() {
        {
            add(21);
            add(5);
            add(3);
            add(-1);
            add(1);
        }
    };
    List<Integer> minList = new ArrayList<>() {
        {
            add(21);
            add(-2);
            add(2);
            add(-4);
            add(1);
        }
    };
    List<Integer> maxList=new ArrayList<>() {
        {
            add(62);
            add(2);
            add(-10);
            add(-2);
            add(1);
        }
    };
    List<Boolean> resList=new ArrayList<>() {
        {
            add(true);
            add(false);
            add(false);
            add(false);
            add(true);
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot273 solution=new Copilot273();
        int passCount=0;
        for (int i=0;i<values.size();i++){
            int value=values.get(i);
            int min=minList.get(i);
            int max=maxList.get(i);
            try {
                solution.checkRange(value,min,max);
                if (resList.get(i)){
                    passCount++;
                }
            }catch (IllegalArgumentException e){
                if (!resList.get(i)){
                    passCount++;
                }
            }catch (Exception e){

            }
        }
        return new int[]{passCount,values.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder273 solution=new Aixcoder273();
        int passCount=0;
        for (int i=0;i<values.size();i++){
            int value=values.get(i);
            int min=minList.get(i);
            int max=maxList.get(i);
            try {
                solution.checkRange(value,min,max);
                if (resList.get(i)){
                    passCount++;
                }
            }catch (IllegalArgumentException e){
                if (!resList.get(i)){
                    passCount++;
                }
            }catch (Exception e){

            }
        }
        return new int[]{passCount,values.size()};
    }
}
