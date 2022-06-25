package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class Aixcoder30 extends GenerateMethodBase {
        public < K , V > Map. Entry < K , V > getEntry (Map < K , V > map , K key ) {
//if ( map instanceof WeakHashMap) {
//return ( ( WeakHashMap < K , V > ) map ) . getEntry ( key ) ;
//}
Iterator< Map . Entry < K , V > > it = map . entrySet ( ) . iterator ( ) ;
while ( it . hasNext ( ) ) { 
Map . Entry < K , V > e = it . next ( ) ; 
if ( key . equals ( e . getKey ( ) ) ) { 
return e ; 
} 
} 
return null ; 
} 
    }
