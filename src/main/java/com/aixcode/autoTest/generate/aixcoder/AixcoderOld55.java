package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld55 extends GenerateMethodBase {
    public boolean isLetterOrDigit(String str)
        { 
String regex = "^[a-zA-Z0-9]+$" ; 
return str . matches ( regex ) ; 
} 
    }
