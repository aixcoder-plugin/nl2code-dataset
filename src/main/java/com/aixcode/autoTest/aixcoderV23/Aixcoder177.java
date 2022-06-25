package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.management.ManagementFactory;

public class Aixcoder177 extends GenerateMethodBase {
        public String getProcessId ( ) { 
String name = ManagementFactory. getRuntimeMXBean ( ) . getName ( ) ;
String pid = name . split ( "@" ) [ 0 ] ; 
return pid ; 
} 
    }
