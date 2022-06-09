package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder26;
import com.aixcode.autoTest.version1.copilot.Copilot26;

import java.util.HashMap;
import java.util.Map;

public class Check26 extends BaseAbstractTest {
    public static Map<String,Boolean> checkMap = new HashMap<>(){
        {
            put("2.1",true);
            put("5a",false);
            put("2e3",true);
            put("0x8",true);
            put("03",true);
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot26 solution=new Copilot26();
        int passCount=0;
        for(Map.Entry<String,Boolean> entry:checkMap.entrySet()){
            String key=entry.getKey();
            Boolean value=entry.getValue();
            try {
                if (solution.isNumber(key)==value){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,checkMap.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder26 solution=new Aixcoder26();
        int passCount=0;
        for(Map.Entry<String,Boolean> entry:checkMap.entrySet()){
            String key=entry.getKey();
            Boolean value=entry.getValue();
            try {
                if (solution.isNumber(key)==value){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,checkMap.size()};
    }
}
