package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class AixcoderOld124 extends GenerateMethodBase {
    public void append(List<String> list, String item)
        { 
if ( list . size ( ) > 0 ) { 
list . set ( list . size ( ) -1 , list . get ( list . size ( ) -1 ) + " " + item ) ; 
} else { 
list . add ( item ) ; 
} 
} 
    }
