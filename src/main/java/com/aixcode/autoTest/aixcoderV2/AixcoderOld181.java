package com.aixcode.autoTest.aixcoderV2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld181 extends GenerateMethodBase {
        public List<Class> getClassGenricType ( Class clazz ) {
            Type genType = clazz.getGenericSuperclass();

            if (!(genType instanceof ParameterizedType)) {
                return null;
            }

            Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

            if (params == null || params.length == 0) {
                return null;
            }

            List<Class> list = new ArrayList<Class>();

            for (Type type : params) {
                if (type instanceof Class) {
                    list.add((Class) type);
                }
            }

            return list;
} 
    }
