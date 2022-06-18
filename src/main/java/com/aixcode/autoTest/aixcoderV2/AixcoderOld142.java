package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld142 extends GenerateMethodBase {
        public String getTopDomain ( String url ) { 
if ( url . contains ( "." ) ) { 
return url . substring ( 0 , url . lastIndexOf ( "." ) ) ; 
} 
return url ; 
} 
    }
