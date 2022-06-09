package com.aixcode.autoTest.version1.copilot;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Copilot372 {
    /**
     * 通过反射获取某个类的对象内所有的 public 成员变量, 包括该类的基类
     */
    public static List<Field> getFields(Class<?> clazz) {
        List<Field> fields = new ArrayList<>();
        while (clazz != null) {
            for (Field field : clazz.getDeclaredFields()) {
                if (Modifier.isPublic(field.getModifiers())) {
                    fields.add(field);
                }
            }
            clazz = clazz.getSuperclass();
        }
        return fields;
    }
}
