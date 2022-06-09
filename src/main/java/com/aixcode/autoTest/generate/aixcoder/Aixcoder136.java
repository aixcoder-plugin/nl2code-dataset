package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Field;

public class Aixcoder136 extends GenerateMethodBase {
    /**
     *  Attempt to find a field on the supplied Class with the supplied name and/or type. Searches all superclasses up to Object.
     */
    @Override
    public Field findField(Class clazz, String name, Class type) {
        if (clazz == null) {
            throw new IllegalArgumentException("Class must not be null");
        }

        if (name == null && type == null) {
            throw new IllegalArgumentException("Either name or type of the field must be specified");
        }

        Class searchType = clazz;

        while (!Object.class.equals(searchType) && searchType != null) {
            Field[] fields = searchType.getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];

                if ((name == null || name.equals(field.getName())) && (type == null || type.equals(field.getType()))) {
                    return field;
                }
            }

            searchType = searchType.getSuperclass();
        }

        return null;
    }
}
