package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld172 extends GenerateMethodBase {
        public String bigDecimalSubtract ( String str , String str1 ) { 
BigDecimal bd = new BigDecimal ( str ) ; 
BigDecimal bd1 = new BigDecimal ( str1 ) ; 
return rvZeroAndDot ( bd . subtract ( bd1 ) . toPlainString ( ) ) ; 
} 
    }
