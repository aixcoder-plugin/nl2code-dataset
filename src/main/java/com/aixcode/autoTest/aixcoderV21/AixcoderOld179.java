package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class AixcoderOld179 extends GenerateMethodBase {
    public Long incrBy(Map<String,Long> valMap, String key, Long integer)
        { 
if ( valMap . containsKey ( key ) ) { 
return valMap . get ( key ) + integer ; 
} 
return valMap . put ( key , integer ) ; 
} 
    }
