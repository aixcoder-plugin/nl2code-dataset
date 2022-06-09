package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.List;

public class Evaluation86 extends AbstractBaseEvaluation {
    List<List<String>> collection1 = new ArrayList<>() {{
        add(new ArrayList<String>() {{
            add("absfd");
            add("bdsafds");
            add("cdsaf");
        }});
        add(new ArrayList<String>() {{
            add("gad;lkjagsd");
            add("ewjedsaf");
        }});
        add(new ArrayList<String>() {{
            add("a");
        }});
        add(new ArrayList<String>() {{
            add("d");
        }});
        add(new ArrayList<String>());
    }};
    List<String> collection2 = new ArrayList<>() {{
        add("absfd");
        add("fsdafdsafsd");
        add("a");
        add("dsdf");
        add("fs");
    }};
    List<Boolean> expectList=new ArrayList<>(){{
        add(true);
        add(false);
        add(true);
        add(false);
        add(false);
    }};

    public Evaluation86(String basePackage, String prefix) {
        super(basePackage, prefix);
    }


    @Override
    public int[] evaluation() {
        int passCount=0;
        for (int i=0;i<collection1.size();i++){
            List<String> collection1Item=collection1.get(i);
            String collection2Item=collection2.get(i);
            try {
                boolean res=solution.containsKey(collection1Item, collection2Item);
                if (res==expectList.get(i)){
                    passCount++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return new int[]{passCount,collection1.size()};
    }
}
