package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld171 extends GenerateMethodBase {
    public String rvZeroAndDot(String s)
        { 
if ( s . isEmpty ( ) ) { 
return "0" ; 
} 
if ( s . indexOf ( "." ) > 0 ) { 
s = s . replaceAll ( "0+?$" , "" ) ; 
// 如最后一位是.则去掉
s = s . replaceAll ( "[.]$" , "" ) ; 
} 
return s ; 
} 
    }
