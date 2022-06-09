package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder23;
import com.aixcode.autoTest.version1.copilot.Copilot23;

import java.util.HashMap;
import java.util.Map;

public class Check23 extends BaseAbstractTest {
    public Map<String,Integer> map = new HashMap<>(){
        {
            put("0xF1",241);
            put("0x65",101);
            put("0x3a",58);
            put("0xFE",-2);
            put("6a1a",27162);
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot23 solution=new Copilot23();
        int passCount=0;
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            try {
                Integer res=solution.hexStringToInt(key);
                if (res.equals(value)){
                    passCount++;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return new int[]{passCount,map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder23 solution=new Aixcoder23();
        int passCount=0;
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            try {
                Integer res=solution.hexStringToInt(key);
                if (res.equals(value)){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,map.size()};
    }
}
