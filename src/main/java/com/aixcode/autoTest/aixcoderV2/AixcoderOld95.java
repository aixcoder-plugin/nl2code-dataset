package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld95 extends GenerateMethodBase {
        public boolean equals ( Object o1 , Object o2 ) 
if ( o1 == o2 ) { 
return true ; 
} 
/ If not equal, maybe one of the objects is null.
if ( o1 == null || o2 == null ) { 
return false ; 
} 
// If the objects are the same, then they are the same.
if ( o1 == o2 ) { 
return true ; 
} 
// If the objects are different, then they are not the same.
if ( ! ( o1 instanceof java . lang . String ) ) { 
return false ; 
} 
if ( ! ( o2 instanceof java . lang . String ) ) { 
return false ; 
} 
// If the objects are the same, then they are the same.
return o1 . equals ( o2 ) ; 
} 
    }
