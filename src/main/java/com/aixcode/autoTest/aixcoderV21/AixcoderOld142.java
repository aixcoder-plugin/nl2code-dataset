package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld142 extends GenerateMethodBase {
    public String getTopDomain(String url)
        { 
if ( url . contains ( "." ) ) { 
return url . substring ( 0 , url . lastIndexOf ( "." ) ) ; 
} 
return url ; 
} 
    }
