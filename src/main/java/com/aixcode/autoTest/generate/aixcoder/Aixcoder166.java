package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;

public class Aixcoder166 extends GenerateMethodBase {
    /**
     * 通过反射为对象的对应字段注入值
     */
    public<T> T initByReflect(String name, String value, T t) {
        try {
            Class<?> clazz = t.getClass();
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                if (field.getName().equals(name)) {
                    field.setAccessible(true);
                    field.set(t, value);
                }
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }

        return t;
    }
}
