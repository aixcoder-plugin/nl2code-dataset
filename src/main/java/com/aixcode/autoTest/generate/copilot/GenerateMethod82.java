package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod82 extends GenerateMethodBase {
    /**
     * Debug helper function that returns the diff of two property maps, only displaying the key that is different and in which map it exists compared to the other map,example:map1:key1,key2 map2:key1,key2,key3
     */
    public String diff(java.util.Map<String, String> map1, java.util.Map<String, String> map2){
        StringBuilder sb = new StringBuilder();
        for(String key:map1.keySet()){
            if(!map2.containsKey(key)){
                sb.append(key).append(" only in map1\n");
            }else if(!map1.get(key).equals(map2.get(key))){
                sb.append(key).append(" in map1:").append(map1.get(key)).append(" in map2:").append(map2.get(key)).append("\n");
            }
        }
        for(String key:map2.keySet()){
            if(!map1.containsKey(key)){
                sb.append(key).append(" only in map2\n");
            }
        }
        return sb.toString();
    }
}
