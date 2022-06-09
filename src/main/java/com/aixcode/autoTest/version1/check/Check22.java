package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder22;
import com.aixcode.autoTest.version1.copilot.Copilot22;

import java.util.ArrayList;
import java.util.List;

public class Check22 extends BaseAbstractTest {
    List<Integer> list1=new ArrayList<>(){
        {
            add(232);
            add((int) Integer.MIN_VALUE);
            add((int) 2e9);
            add((int) -1e9);
            add((int) 0);
        }
    };
    List<Integer> list2=new ArrayList<>(){
        {
            add(2342);
            add(0);
            add((int) 1e9);
            add(4);
            add((int) Integer.MAX_VALUE);
        }
    };
    List<Boolean> list3=new ArrayList<>(){
        {
            add(false);
            add(false);
            add(true);
            add(false);
            add(false);
        }
    };

    public static void main(String[] args) {
        int num=(int)2e9;
        System.out.println(num);
    }
    @Override
    public int[] checkCopilot() {
        Copilot22 solution=new Copilot22();
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            int list1Item=list1.get(i);
            int list2Item=list2.get(i);
            try {
                boolean res=solution.checkOverflow(list1Item, list2Item);
                if (res==list3.get(i)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list1.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder22 solution=new Aixcoder22();
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            int list1Item=list1.get(i);
            int list2Item=list2.get(i);
            try {
                boolean res=solution.checkOverflow(list1Item, list2Item);
                if (res==list3.get(i)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,list1.size()};
    }
}
