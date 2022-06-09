package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder320;
import com.aixcode.autoTest.version1.copilot.Copilot320;

import java.util.HashMap;
import java.util.Map;

public class Check320 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot320 solution = new Copilot320();
        Object[] objs = {"a","b", "c"};
        Map<Integer,Object> map = new HashMap<Integer, Object>(){{
            put(0, "a");
            put(1, "b");
            put(2, "c");
            put(3,null);
            put(4, null);
        }};
        int pass_count = 0;
        for (Map.Entry<Integer,Object> entry : map.entrySet()){
            try {
                if (null != entry.getValue()){
                    if (solution.get(objs, entry.getKey()).equals(entry.getValue())){
                        pass_count++;
                    }
                }else{
                    if (null == solution.get(objs, entry.getKey())){
                        pass_count++;
                    }
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count, map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder320 solution = new Aixcoder320();
        Object[] objs = {"a","b", "c"};
        Map<Integer,Object> map = new HashMap<Integer, Object>(){{
            put(0, "a");
            put(1, "b");
            put(2, "c");
            put(3,null);
            put(4, null);
        }};
        int pass_count = 0;
        for (Map.Entry<Integer,Object> entry : map.entrySet()){
            try {
                if (null != entry.getValue()){
                    if (solution.get(objs, entry.getKey()).equals(entry.getValue())){
                        pass_count++;
                    }
                }else{
                    if (null == solution.get(objs, entry.getKey())){
                        pass_count++;
                    }
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count, map.size()};
    }
}
