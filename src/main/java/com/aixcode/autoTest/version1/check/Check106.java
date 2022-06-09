package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder106;
import com.aixcode.autoTest.version1.copilot.Copilot106;

import java.util.ArrayList;
import java.util.List;

public class Check106 extends BaseAbstractTest {
    List list1=new ArrayList<>(){
        {
            add((Object) new String("abcsdf"));
            add((Object) new ArrayList<>());
            add((Object) new String(""));
            add((Object) Integer.valueOf(10));
            add((Object) new Check126());
        }
    };
    List<Class> list2=new ArrayList<>(){
        {
            add(String.class);
            add(List.class);
            add(Character.class);
            add(Integer.class);
            add(BaseAbstractTest.class);
        }
    };
    List<Boolean> list3=new ArrayList<>(){
        {
            add(true);
            add(true);
            add(false);
            add(true);
            add(true);
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot106 solution=new Copilot106();
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            Object list1Item=list1.get(i);
            Class list2Item=list2.get(i);
            try {
                boolean res=solution.isInstanceOf(list1Item, list2Item);
                if (res==list3.get(i)){
                    passCount++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return new int[]{passCount,list1.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder106 solution=new Aixcoder106();
        int passCount=0;
        for (int i=0;i<list1.size();i++){
            Object list1Item=list1.get(i);
            Class list2Item=list2.get(i);
            try {
                boolean res=solution.isInstanceOf(list1Item, list2Item);
                if (res==list3.get(i)){
                    passCount++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return new int[]{passCount,list1.size()};
    }
}
