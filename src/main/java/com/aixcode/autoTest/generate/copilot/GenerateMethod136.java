package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;

public class GenerateMethod136 extends GenerateMethodBase {
    /**
     *   Attempt to find a field on the supplied Class with the supplied name and/or type. Searches all superclasses up to Object.
     */
    @Override
    public Field findField(Class clazz, String name, Class type) {
        Field field = null;
        try {
            field = clazz.getDeclaredField(name);
        } catch (NoSuchFieldException e) {
            // ignore
        }
        if (field == null) {
            try {
                field = clazz.getField(name);
            } catch (NoSuchFieldException e) {
                // ignore
            }
        }
        if (field == null) {
            try {
                field = clazz.getDeclaredField(type.getName());
            } catch (NoSuchFieldException e) {
                // ignore
            }
        }
        if (field == null) {
            try {
                field = clazz.getField(type.getName());
            } catch (NoSuchFieldException e) {
                // ignore
            }
        }
        if (field == null) {
            Class superClass = clazz.getSuperclass();
            if (superClass != null) {
                field = findField(superClass, name, type);
            }
        }
        return field;
    }
}
