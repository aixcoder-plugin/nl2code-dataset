package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;

public class AixcoderOld28 extends GenerateMethodBase {
    public java.util.List<String> split(String sequence, String delimiter)
        { 
java . util . List < String > result = new ArrayList< String >( ) ;
int start = 0 ; 
int index = 0 ; 
while ( ( index = sequence . indexOf ( delimiter , start ) ) != -1 ) { 
result . add ( sequence . substring ( start , index ) ) ; 
start = index + delimiter . length ( ) ; 
} 
result . add ( sequence . substring ( start ) ) ; 
return result ; 
} 
    }
