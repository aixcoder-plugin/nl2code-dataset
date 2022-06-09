package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder336;
import com.aixcode.autoTest.version1.copilot.Copilot336;

import java.util.ArrayList;
import java.util.List;

public class Check336 extends BaseAbstractTest {
    List<Integer> list1 = new ArrayList<>(){
        {
            add(232);
            add(2);
            add(0);
            add(-1);
            add((int) -1e9);
        }
    };
    List<Integer> list2 = new ArrayList<>(){
        {
            add(2342);
            add(-2);
            add(0);
            add(-4);
            add((int) -1e9);
        }
    };
    List<Integer> list3 = new ArrayList<>(){
        {
            add(1287);
            add(0);
            add(0);
            add(-2);
            add((int) -1e9);
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot336 solution=new Copilot336();
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            int list1Item=list1.get(i);
            int list2Item=list2.get(i);
            int list3Item=list3.get(i);
            try {
                int res=solution.average(list1Item, list2Item);
                if (res==list3Item){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list1.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder336 solution=new Aixcoder336();
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            int list1Item=list1.get(i);
            int list2Item=list2.get(i);
            int list3Item=list3.get(i);
            try {
                int res=solution.average(list1Item, list2Item);
                if (res==list3Item){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list1.size()};
    }
}
