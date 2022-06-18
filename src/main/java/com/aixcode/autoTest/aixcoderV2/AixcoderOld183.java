package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld183 extends GenerateMethodBase {
        public BigDecimal add ( BigDecimal aVal , BigDecimal bVal ) { 
aVal = aVal == null ? BigDecimal . ZERO : aVal ; 
bVal = bVal == null ? BigDecimal . ZERO : bVal ; 
return aVal . add ( bVal ) ; 
} 
    }
