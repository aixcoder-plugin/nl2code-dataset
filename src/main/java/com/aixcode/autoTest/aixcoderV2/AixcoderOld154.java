package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld154 extends GenerateMethodBase {
        public URL getUrlFile ( String fileName ) { 
if ( StringUtil . isEmpty ( fileName ) ) { 
return null ; 
} 
return this . getClass ( ) . getClassLoader ( ) . getResource ( fileName ) ; 
} 
    }
