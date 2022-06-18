package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld72 extends GenerateMethodBase {
        public < T > T newInstance ( Class < T > clazz ) { 
try { 
return clazz . newInstance ( ) ; 
} catch ( InstantiationException e ) { 
throw new RuntimeException ( e ) ; 
} catch ( IllegalAccessException e ) { 
throw new RuntimeException ( e ) ; 
} 
} 
    }
