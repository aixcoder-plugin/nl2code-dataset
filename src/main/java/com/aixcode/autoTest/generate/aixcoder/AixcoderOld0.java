package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Iterator;
import java.util.List;

public class AixcoderOld0 extends GenerateMethodBase {
    public String collectionToCommaDelimitedString(List<String> coll)
        { 
StringBuilder sb = new StringBuilder ( ) ; 
for (Iterator< String > it = coll . iterator ( ); it . hasNext ( ) ; ) {
sb . append ( it . next ( ) ) ; 
if ( it . hasNext ( ) ) { 
sb . append ( ", " ) ; 
} 
} 
return sb . toString ( ) ; 
} 
    }
