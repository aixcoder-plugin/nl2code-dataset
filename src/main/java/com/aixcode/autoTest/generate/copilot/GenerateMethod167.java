package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.List;

public class GenerateMethod167 extends GenerateMethodBase {
    /**
     * 将数组转为 List
     */
    public <T> List<T> array2List(T[] array) {
        List<T> list = new ArrayList<T>();
        for (T t : array) {
            list.add(t);
        }
        return list;
    }
}
