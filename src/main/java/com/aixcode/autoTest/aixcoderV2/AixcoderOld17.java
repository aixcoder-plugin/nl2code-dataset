package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld17 extends GenerateMethodBase {
        public Charset charsetForName ( String charsetName ) { 
if ( charsetName == null ) { 
return null ; 
} 
try { 
return Charset . forName ( charsetName ) ; 
} catch ( Exception e ) { 
return null ; 
} 
} 
    }
