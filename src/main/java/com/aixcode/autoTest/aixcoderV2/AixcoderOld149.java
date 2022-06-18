package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld149 extends GenerateMethodBase {
        public float getRadian ( Point A , Point B ) { 
if ( A == null || B == null ) { 
return 0 ; 
} 
float dx = B . x - A . x ; 
float dy = B . y - A . y ; 
return ( float ) Math . atan ( dy / dx ) ; 
} 
    }
