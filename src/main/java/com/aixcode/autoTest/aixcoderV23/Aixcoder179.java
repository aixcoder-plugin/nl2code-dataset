package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class Aixcoder179 extends GenerateMethodBase {
        public Long incrBy (Map< String , Long > valMap , String key , Long integer ) {
if ( valMap . containsKey ( key ) ) { 
return valMap . put ( key , valMap . get ( key ) + integer ) ; 
} else { 
valMap . put ( key , integer ) ; 
return valMap . get ( key ) ; 
} 
} 
    }
