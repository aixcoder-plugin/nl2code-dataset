package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld51 extends GenerateMethodBase {
        public int hashCode ( byte [ ] byteArr ) { 
int hashCode = 0 ; 
for ( int i = 0 ; i < repn . length ; i ++ ) hashCode = 31 * hashCode + repn [ i ] ; 
for ( int i = 0 ; i < length ; i ++ ) hashCode = 31 * hashCode + ( byteArr [ i ] & 0xFF ) ; 
return hashCode ^ length ; 
} 
    }
