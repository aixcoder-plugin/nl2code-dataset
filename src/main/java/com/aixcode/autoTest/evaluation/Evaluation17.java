package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class Evaluation17 extends AbstractBaseEvaluation {


    public Evaluation17(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String name1 = "UTF-8";
        String name2 = "GBK";
        String name3 = "GB2312";
        String name4 = "ISO-8859-1";
        String name5 = "UTF-16";
        SortedMap<String,Charset> setMap = Charset.availableCharsets();

        Map<String, String> map = new HashMap<String,String>(){{
            put(name1,name1);
            put(name2, name2);
            put(name3, name3);
            put(name4, name4);
            put(name5, name5);
        }};
        int pass_count = 0;
        for (Map.Entry<String,String> entry : map.entrySet()){
            try {
                Charset set = solution.charsetForName(entry.getKey());
                if (setMap.get(entry.getValue()).equals(set)){
                    pass_count ++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
