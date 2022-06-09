package com.aixcode.autoTest.version1.aixcoder;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Aixcoder372 {
    /**
     * 通过反射获取某个类的对象内所有的 public 成员变量, 包括该类的基类
     */
    public static List<Field> getFields(Class<?> clazz) {
        if (null == clazz) {
            return null;
        }

        List<Field> fields = new ArrayList<Field>();

        for (Field field : clazz.getFields()) {
            fields.add(field);
        }

        return fields;
    }


}