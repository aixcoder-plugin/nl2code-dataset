package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;


public class Aixcoder148 extends GenerateMethodBase {
    /**
     *  Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
     */
    @Override
    public<E> void swap(List<E> list, int i, int j) {
        checkPositionIndexes(i, j, list.size());
        E tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
    private void checkPositionIndexes(int i, int j, int size) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        if (j < 0 || j >= size) {
            throw new IndexOutOfBoundsException("Index: " + j + ", Size: " + size);
        }
    }
}
