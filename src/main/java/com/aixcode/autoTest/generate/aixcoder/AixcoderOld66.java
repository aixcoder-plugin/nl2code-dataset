package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;

public class AixcoderOld66 extends GenerateMethodBase {
    public <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2)
        { 
if ( list1 == null ) { 
return list2 ; 
} else if ( list2 == null ) { 
return list1 ; 
} 
ArrayList < T > result = new ArrayList < T > ( ) ; 
result . addAll ( list1 ) ; 
for ( T elt : list2 ) { 
if ( ! result . contains ( elt ) ) { 
result . add ( elt ) ; 
} 
} 
return result ; 
} 
    }
