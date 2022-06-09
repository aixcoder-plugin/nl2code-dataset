package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder250;
import com.aixcode.autoTest.version1.copilot.Copilot250;

import java.util.HashMap;
import java.util.Map;

public class Check250 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot250 solution=new Copilot250();
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("https://www.baidu.com",true);
        map.put("https://aixcoder.com",true);
        map.put("https://gitee.com/",true);
        map.put("http://aixcoder.com:90",true);
        map.put("http://testserver3.nnthink.com:8887",true);
        int pass_count = 0;

        for(Map.Entry<String,Boolean> entry:map.entrySet()){
            try{
                if((solution.getProperties(entry.getKey()).size()>0) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder250 solution=new Aixcoder250();
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("https://www.baidu.com",true);
        map.put("https://aixcoder.com",true);
        map.put("https://gitee.com/",true);
        map.put("http://aixcoder.com:90",true);
        map.put("http://testserver3.nnthink.com:8887",true);
        int pass_count = 0;

        for(Map.Entry<String,Boolean> entry:map.entrySet()){
            try{
                if((solution.getProperties(entry.getKey()).size()>0) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
