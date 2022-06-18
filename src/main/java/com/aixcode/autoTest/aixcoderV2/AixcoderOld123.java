package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld123 extends GenerateMethodBase {
        public int floor ( int x , int quantum ) { 
if ( x < 0 ) 
throw new IllegalArgumentException ( "Negative input to floor()" ) ; 
if ( quantum == 0 || x == 0 ) 
return 0 ; 
if ( x < 1 ) 
return x ; 
int qfloor = floor ( x ) ; 
if ( qfloor < 0 ) 
return qfloor -1 ; 
if ( qfloor == 0 ) 
return 0 ; 
if ( qfloor == 1 ) 
return 1 ; 
if ( x - qfloor < quantum ) 
return qfloor -1 ; 
return qfloor ; 
} 
    }
