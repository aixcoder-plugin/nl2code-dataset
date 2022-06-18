package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld100 extends GenerateMethodBase {
        public String canonicalEncodingName ( String encoding ) { 
if ( encoding == null ) { 
return null ; 
} 
try { 
return Charset . forName ( encoding ) . name ( ) ; 
} catch ( IllegalCharsetNameException icne ) { 
return encoding ; 
} catch ( UnsupportedCharsetException uce ) { 
return encoding ; 
} 
} 
    }
