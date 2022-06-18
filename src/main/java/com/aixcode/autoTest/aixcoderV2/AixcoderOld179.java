package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld179 extends GenerateMethodBase {
        public Long incrBy ( Map < String , Long > valMap , String key , Long integer ) { 
if ( valMap . containsKey ( key ) ) { 
return valMap . get ( key ) + integer ; 
} 
return valMap . put ( key , integer ) ; 
} 
    }
