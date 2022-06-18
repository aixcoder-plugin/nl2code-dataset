package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld96 extends GenerateMethodBase {
        public double [ ] product ( double [ ] columnVector , double [ ] [ ] matrix ) { 
if ( columnVector . length != matrix . length ) { 
throw new IllegalArgumentException ( "vector length and matrix length do not match" ) ; 
} 
double [ ] product = new double [ matrix [ 0 ] . length ] ; 
for ( int i = 0 ; i < product . length ; i ++ ) { 
product [ i ] = 0 ; 
for ( int j = 0 ; j < product . length ; j ++ ) { 
product [ i ] += matrix [ i ] [ j ] * columnVector [ j ] ; 
} 
} 
return product ; 
} 
    }
