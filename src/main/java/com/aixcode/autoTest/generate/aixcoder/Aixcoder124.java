package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.ArrayList;
import java.util.List;

public class Aixcoder124 extends GenerateMethodBase {
    public void append(List<String> list, String item) {
        if (list == null)
            list = new ArrayList<String>();

        list.add(item);
    }
}

