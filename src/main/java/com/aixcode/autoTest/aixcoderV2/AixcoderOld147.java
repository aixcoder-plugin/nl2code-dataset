package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld147 extends GenerateMethodBase {
        String getPid ( FutureTask t ) { 
if ( t != null ) { 
Object o = t . result ; 
if ( o != null ) { 
return o . toString ( ) ; 
} 
} 
return null ; 
} 
    }
