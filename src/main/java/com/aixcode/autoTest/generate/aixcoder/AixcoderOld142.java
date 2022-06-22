package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld142 extends GenerateMethodBase {
    public String getTopDomain(String url)
        { 
if ( url . endsWith ( "/" ) ) { 
url = url . substring ( 0 , url . length ( ) -1 ) ; 
} 
String [ ] split = url . split ( "/" ) ; 
return split [ split . length -1 ] ; 
} 
    }
