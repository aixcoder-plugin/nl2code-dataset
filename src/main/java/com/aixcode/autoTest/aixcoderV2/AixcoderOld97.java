package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld97 extends GenerateMethodBase {
        public < T > T [ ] concat ( T [ ] a , T [ ] b ) { 
T [ ] c = Arrays . copyOf ( a , a . length + b . length ) ; 
System . arraycopy ( b , 0 , c , a . length , b . length ) ; 
return c ; 
} 
    }
