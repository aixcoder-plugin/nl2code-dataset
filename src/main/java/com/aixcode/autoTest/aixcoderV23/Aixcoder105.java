package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Iterator;

public class Aixcoder105 extends GenerateMethodBase {
        public int next (Iterator< Integer > iterator , int n ) {
int result = 0 ; 
while ( n > 0 && iterator . hasNext ( ) ) { 
result = iterator . next ( ) ; 
-- n ; 
} 
while ( iterator . hasNext ( ) ) { 
iterator . next ( ) ; 
++ n ; 
} 
return result ; 
} 
    }
