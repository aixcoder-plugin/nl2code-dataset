package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld148 extends GenerateMethodBase {
        public < E > void swap ( List < E > list , int i , int j ) { 
//checkPositionIndexes ( i , j , list . size ( ) ) ;
E tmp = list . get ( i ) ; 
list . set ( i , list . get ( j ) ) ; 
list . set ( j , tmp ) ; 
} 
    }
