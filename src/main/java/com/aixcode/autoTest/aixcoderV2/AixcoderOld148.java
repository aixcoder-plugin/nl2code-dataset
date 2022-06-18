package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;
public class AixcoderOld148 extends GenerateMethodBase {
    public <E> void swap(List<E> list, int i, int j) {
//checkPositionIndexes ( i , j , list . size ( ) ) ;
        E tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
}
