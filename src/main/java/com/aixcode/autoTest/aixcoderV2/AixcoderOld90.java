package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld90 extends GenerateMethodBase {
        public void addToSet ( Map < String , HashSet < Integer > > map , String key , Integer value ) { 
if ( map == null ) { 
return ; 
} 
if ( ! map . containsKey ( key ) ) { 
map . put ( key , new HashSet < > ( ) ) ; 
} 
map . get ( key ) . add ( value ) ; 
} 
    }
