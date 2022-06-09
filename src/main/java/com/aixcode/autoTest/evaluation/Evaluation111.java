package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation111 extends AbstractBaseEvaluation {

    public Evaluation111(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    Map<String,Boolean> map = new HashMap<>(){{
        put("D:\\software\\jetBrains",true);
        put("D:\\",true);
        put("C:\\Users\\",true);
        put("Program Files\\Java",false);
        put("/home/user/diskb/home/",false);

    }};

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for (Map.Entry<String,Boolean> entry : map.entrySet()){
            try {
                boolean bool = solution.isWindowsAbsolutePath(entry.getKey());
                if (bool == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
