package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Collection;

public class AixcoderOld86 extends GenerateMethodBase {
    public boolean containsKey(Collection<String> collection, String key)
        { 
if ( collection == null || key == null ) { 
return false ; 
} 
return collection . contains ( key ) ; 
} 
    }
