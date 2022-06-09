package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder289;
import com.aixcode.autoTest.version1.copilot.Copilot289;

import java.util.HashMap;
import java.util.Map;

public class Check289 extends BaseAbstractTest {
    Map<String,String> map=new HashMap<>(){
        {
            put("&Look && Feel","Look & Feel");
            put("bg&&","bg&");
            put("&cdjfas;d","cdjfas;d");
            put("sa_19dsajfasd","sa_19dsajfasd");
            put("&&______&&______","&______&______");
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot289 solution = new Copilot289();
        int pass_count = 0;
        for(Map.Entry<String,String> entry:map.entrySet()){
            try{
                if(solution.convertMnemonicString(entry.getKey()).equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder289 solution = new Aixcoder289();
        int pass_count = 0;
        for(Map.Entry<String,String> entry:map.entrySet()){
            try{
                if(solution.convertMnemonicString(entry.getKey()).equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
