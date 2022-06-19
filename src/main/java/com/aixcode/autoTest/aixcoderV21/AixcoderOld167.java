package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AixcoderOld167 extends GenerateMethodBase {
    public <T> List<T> array2List(T[] array)
        { 
List < T > list = new ArrayList< >( array . length ) ;
Collections. addAll ( list , array ) ;
return list ; 
} 
    }
