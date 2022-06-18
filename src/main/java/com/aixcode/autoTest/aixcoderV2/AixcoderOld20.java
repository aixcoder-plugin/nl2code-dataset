package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld20 extends GenerateMethodBase {
    public Object get(Object[] array, int index) {
        if (array == null) {
            return null;
        }
        Object value = array[index];
        if (value == null) {
            value = null;
        }
        return value;
    }
}
