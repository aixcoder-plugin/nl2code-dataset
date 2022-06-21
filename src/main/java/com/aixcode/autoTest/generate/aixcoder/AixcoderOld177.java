package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.management.ManagementFactory;

public class AixcoderOld177 extends GenerateMethodBase {
    public String getProcessId()
        { 
String name = ManagementFactory. getRuntimeMXBean ( ) . getName ( ) ;
String pid = name . split ( "@" ) [ 0 ] ; 
return pid ; 
} 
    }
