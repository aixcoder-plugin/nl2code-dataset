package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld66 extends GenerateMethodBase {
        public < T > ArrayList < T > merge ( ArrayList < T > list1 , ArrayList < T > list2 ) { 
ArrayList < T > result = new ArrayList < T > ( ) ; 
// Keep track of the range of elements that we need to add.
int range1 = 0 ; 
int range2 = 0 ; 
// Iterate through the first list.
while ( range1 < list1 . size ( ) && range2 < list2 . size ( ) ) { 
T elem1 = list1 . get ( range1 ) ; 
T elem2 = list2 . get ( range2 ) ; 
int cmp = 0 ;
if ( cmp < 0 ) { 
// We know list1 is sorted so we can add elem1 at the front.
result . add ( elem1 ) ; 
range1 ++ ; 
} else if ( cmp > 0 ) { 
// We know list2 is sorted so we can add elem2 at the front.
result . add ( elem2 ) ; 
range2 ++ ; 
} else { 
// We don't know how to merge so just add elem1 and elem2 at the end.
result . add ( elem2 ) ; 
range2 ++ ; 
} 
} 
// Add any elements left in the first list.
while ( range1 < list1 . size ( ) ) { 
result . add ( list1 . get ( range1 ) ) ; 
range1 ++ ; 
} 
// Add any elements left in the second list.
while ( range2 < list2 . size ( ) ) { 
result . add ( list2 . get ( range2 ) ) ; 
range2 ++ ; 
} 
return result ; 
} 
    }
