package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld85 extends GenerateMethodBase {
    public String appendTrailing(String str, String trailing)
        { 
if ( str == null || str . isEmpty ( ) ) { 
return null ; 
} 
if ( trailing ==null ) {
return trailing ; 
} 

if ( str . endsWith ( "\n" ) ) { 
return str + trailing ; 
} 
if ( str . endsWith ( "\r" ) ) { 
return str + trailing ; 
} 
return str + "\n" + trailing ; 
} 
    }
