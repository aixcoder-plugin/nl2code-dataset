package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;

public class Aixcoder148 extends GenerateMethodBase {
        public < E > void swap (List< E > list , int i , int j ) {
if ( list == null ) { 
throw new NullPointerException ( ) ; 
} 
if ( i < 0 || i >= list . size ( ) ) { 
throw new IndexOutOfBoundsException ( "i < 0 || i >= list.size()" ) ; 
} 
if ( j < 0 || j >= list . size ( ) ) { 
throw new IndexOutOfBoundsException ( "j < 0 || j >= list.size()" ) ; 
} 
if ( i == j ) { 
// noinspection unchecked
return ; 
} 
E tmp = list . get ( i ) ; 
list . set ( i , list . get ( j ) ) ; 
list . set ( j , tmp ) ; 
} 
    }
