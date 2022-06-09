package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder307;
import com.aixcode.autoTest.version1.copilot.Copilot307;

import java.util.HashMap;
import java.util.Map;

public class Check307 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot307 solution = new Copilot307();
        Map<String,Integer> map = new HashMap<String,Integer>(){{
            put("a=a",1);
            put("a=a&b=b",2);
            put("a=a&b=b&c=c",3);
            put("a=a&b=b&c=c&d=d",4);
            put("a=a&b=b&c=c&d=d&e=e",5);
        }};
        int pass_count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                if (solution.parseQueryString(entry.getKey()).size() == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder307 solution = new Aixcoder307();
        Map<String,Integer> map = new HashMap<String,Integer>(){{
            put("a=a",1);
            put("a=a&b=b",2);
            put("a=a&b=b&c=c",3);
            put("a=a&b=b&c=c&d=d",4);
            put("a=a&b=b&c=c&d=d&e=e",5);
        }};
        int pass_count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                if (solution.parseQueryString(entry.getKey()).size() == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
