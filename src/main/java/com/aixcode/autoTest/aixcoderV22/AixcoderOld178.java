package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld178 extends GenerateMethodBase {
    public int versionCompare(String v1, String v2)
        { 
String [ ] v1Parts = v1 . split ( "\\." ) ; 
String [ ] v2Parts = v2 . split ( "\\." ) ; 
int i = 0 ; 
while ( i < v1Parts . length && i < v2Parts . length && v1Parts [ i ] . equals ( v2Parts [ i ] ) ) { 
i ++ ; 
} 
if ( i < v1Parts . length && i < v2Parts . length ) { 
return Integer . valueOf ( v1Parts [ i ] ) . compareTo ( Integer . valueOf ( v2Parts [ i ] ) ) ; 
} 
return Integer . valueOf ( v1Parts [ v1Parts . length -1 ] ) . compareTo ( Integer . valueOf ( v2Parts [ v2Parts . length -1 ] ) ) ; 
} 
    }
