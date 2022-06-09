package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;

public class Evaluation105 extends AbstractBaseEvaluation {

    public Evaluation105(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        List<Integer> list1 = new ArrayList<>(){{
            add(12);
            add(22);
            add(-12);
            add(42);
            add(53);
            add(63);
        }};
        List<Integer> list2 = new ArrayList<>(){{
            add(13);
            add(25);
            add(-26);
            add(47);
            add(58);
            add(64);
        }};
        List<Integer> list3 = new ArrayList<>(){{
            add(134);
            add(234);
            add(-33);
            add(43);
            add(52);
            add(64);
        }};
        List<Integer> list4 = new ArrayList<>(){{
            add(15);
            add(28);
            add(-49);
            add(44);
            add(56);
            add(62);
        }};
        List<Integer> list5 = new ArrayList<>(){{
            add(17);
            add(25);
            add(-53);
            add(43);
            add(54);
            add(64);
        }};
        int pass_count = 0;
        Map<List<Integer>, Integer> map = new HashMap<>(){{
            put(list1,-1);
            put(list2,-2);
            put(list3,1);
            put(list4,2);
            put(list5,3);
        }};
        for (Map.Entry<List<Integer>,Integer> entry : map.entrySet()){
            List<Integer> list = entry.getKey();
            Iterator iterator = list.iterator();
            iterator.next();
            iterator.next();
            try {
                int result = solution.next(list1.iterator(), entry.getValue());
                int demo = list.get(2+entry.getValue());
                if (result == demo){
                    pass_count++;
                }

            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
