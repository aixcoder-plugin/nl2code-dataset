package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder82 extends GenerateMethodBase {
        public String diff ( java . util . Map < String , String > map1 , java . util . Map < String , String > map2 ) { 
StringBuilder sb = new StringBuilder ( ) ; 
sb . append ( "=== PropertyMap diff ===\n" ) ; 
sb . append ( "map1:\n" ) ; 
sb . append ( map1 . toString ( ) ) ; 
sb . append ( "\n" ) ; 
sb . append ( "map2:\n" ) ; 
sb . append ( map2 . toString ( ) ) ; 
sb . append ( "\n" ) ; 
sb . append ( "=== PropertyMap diff ===\n" ) ; 
sb . append ( "map1 size: " + map1 . size ( ) + "\n" ) ; 
sb . append ( "map2 size: " + map2 . size ( ) + "\n" ) ; 
sb . append ( "map1 keys: " + map1 . keySet ( ) + "\n" ) ; 
sb . append ( "map2 keys: " + map2 . keySet ( ) + "\n" ) ; 
sb . append ( "map1 values: " + map1 . values ( ) + "\n" ) ; 
sb . append ( "map2 values: " + map2 . values ( ) + "\n" ) ; 
return sb . toString ( ) ; 
} 
    }
