package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder405;
import com.aixcode.autoTest.version1.copilot.Copilot405;

import java.util.ArrayList;
import java.util.List;

public class Check405 extends BaseAbstractTest {
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
    @Override
    public int[] checkCopilot() {
        Copilot405 solution = new Copilot405();
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

    @Override
    public int[] checkAixcoder() {
        Aixcoder405 solution = new Aixcoder405();
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
