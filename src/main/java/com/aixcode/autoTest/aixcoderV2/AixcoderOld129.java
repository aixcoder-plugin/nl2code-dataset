package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld129 extends GenerateMethodBase {
        public String getNowDate ( int minute ) { 
Calendar cal = Calendar . getInstance ( ) ; 
cal . add ( Calendar . MINUTE , minute ) ; 
return new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss" ) . format ( cal . getTime ( ) ) ; 
} 
    }
