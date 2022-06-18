package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;

public class GenerateMethod166 extends GenerateMethodBase {
    /**
     * 通过反射为对象的对应字段注入值
     */
    public <T> T initByReflect(String name, String value, T t) throws Exception {
        Field field = t.getClass().getDeclaredField(name);
        field.setAccessible(true);
        field.set(t, value);
        return t;
    }
}
