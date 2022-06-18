package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld43 extends GenerateMethodBase {
        public String updateUrl ( String url , String key , String value ) { 
Map < String , String > map = new HashMap < > ( ) ; 
map . put ( key , value ) ; 
return updateUrl ( url , map ) ; 
} 
    }
