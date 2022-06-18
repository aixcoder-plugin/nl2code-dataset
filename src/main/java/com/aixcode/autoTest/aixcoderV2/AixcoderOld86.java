package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld86 extends GenerateMethodBase {
        public boolean containsKey ( Collection < String > collection , String key ) { 
for ( String value : collection ) { 
if ( value . equals ( key ) ) { 
return true ; 
} 
} 
return false ; 
} 
    }
