package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class GenerateMethod179 extends GenerateMethodBase {
    /**
     *  在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
     */
    @Override
    public Long incrBy(Map<String, Long> valMap, String key, Long integer) {
        if (valMap.containsKey(key)){
            valMap.put(key,valMap.get(key)+integer);
        }else {
            valMap.put(key,integer);
        }
        return valMap.get(key);
    }
}
