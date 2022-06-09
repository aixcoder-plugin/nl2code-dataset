package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;

public class Aixcoder166 extends GenerateMethodBase {
    public<T> T initByReflect(String name, Object value, T t) {
        if (null == t) {
            throw new NullPointerException("t can not be null");
        }

        if (null == value) {
            return null;
        }

        Class<?> clazz = t.getClass();

        if (!clazz.isAssignableFrom(value.getClass())) {
            throw new IllegalArgumentException("value must be assignable to" + clazz);
        }

        try {
            Field field = clazz.getDeclaredField(name);
            field.setAccessible(true);
            field.set(t, value);
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException("no such field:" + name);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("illegal access:" + name);
        }

        return t;
    }
}
