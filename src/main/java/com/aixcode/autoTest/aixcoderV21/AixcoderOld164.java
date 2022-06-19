package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AixcoderOld164 extends GenerateMethodBase {
    public <K, V> Map<V, Set<K>> reverseMapIntoValueSetMap(Map<K, V> map)
        { 
Map < V , Set < K > > reverseMap = new HashMap< V , Set < K > >( ) ;
for ( Map . Entry < K , V > entry : map . entrySet ( ) ) { 
Set < K > keys = reverseMap . get ( entry . getValue ( ) ) ; 
if ( keys == null ) { 
keys = new HashSet< K >( ) ;
reverseMap . put ( entry . getValue ( ) , keys ) ; 
} 
keys . add ( entry . getKey ( ) ) ; 
} 
return reverseMap ; 
} 
    }
