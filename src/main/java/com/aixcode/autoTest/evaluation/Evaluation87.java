package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;
import com.aixcode.autoTest.Executor;

import java.util.ArrayList;
import java.util.List;

public class Evaluation87 extends AbstractBaseEvaluation {
    List list1=new ArrayList<>(){
        {
            add((Object) new String("abcsdf"));
            add((Object) new ArrayList<>());
            add((Object) new String(""));
            add((Object) Integer.valueOf(10));
            add((Object) new Executor());
        }
    };
    List<Class> list2=new ArrayList<>(){
        {
            add(String.class);
            add(List.class);
            add(Character.class);
            add(Integer.class);
            add(Object.class);
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

    public Evaluation87(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
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
