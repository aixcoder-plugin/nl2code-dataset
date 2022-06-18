package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld12 extends GenerateMethodBase {
        public String getValue ( List < String > list , int index ) { 
if ( list == null || index < 0 || index >= list . size ( ) ) { 
return null ; 
} 
return list . get ( index ) ; 
} 
    }
