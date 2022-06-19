package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderOld12 extends GenerateMethodBase {
    public String getValue(List<String> list, int index)
        { 
if ( list == null || index < 0 || index >= list . size ( ) ) { 
return null ; 
} 
return list . get ( index ) ; 
} 
    }
