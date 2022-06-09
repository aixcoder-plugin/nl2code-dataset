package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder243;
import com.aixcode.autoTest.version1.copilot.Copilot243;

import java.util.HashMap;
import java.util.Map;

public class Check243 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot243 solution=new Copilot243();
        Map<String, Object> params = new HashMap<>();
        params.put("normal", "normal");
        params.put("nullable", null);
        params.put("empty", "");
        params.put("integer", 122);
        params.put("boolean", true);
        int pass_count = 0;

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            try{
                solution.ensureNotNull(entry.getValue());
                if(!entry.getKey().equals("nullable")){
                    pass_count++;
                }
            }catch(Exception e){
                if(entry.getKey().equals("nullable")){
                    pass_count++;
                }
            }
        }

        return new int[]{pass_count,params.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder243 solution=new Aixcoder243();
        Map<String, Object> params = new HashMap<>();
        params.put("normal", "normal");
        params.put("nullable", null);
        params.put("empty", "");
        params.put("integer", 122);
        params.put("boolean", true);
        int pass_count = 0;

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            try{
                solution.ensureNotNull(entry.getValue());
                if(!entry.getKey().equals("nullable")){
                    pass_count++;
                }
            }catch(Exception e){
                if(entry.getKey().equals("nullable")){
                    pass_count++;
                }
            }
        }

        return new int[]{pass_count,params.entrySet().size()};
    }
}
