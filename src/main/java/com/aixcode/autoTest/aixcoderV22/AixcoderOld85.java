package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld85 extends GenerateMethodBase {
    public String appendTrailing(String str, String trailing)
        { 
if ( ( str=="" ) ) {
return trailing ; 
} 
if ( ( trailing=="" ) ) {
return str ; 
} 
return str + " " + trailing ; 
} 
    }
