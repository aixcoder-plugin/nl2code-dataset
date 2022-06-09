package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder106 {
    public boolean isInstanceOf(Object object, Class<?> type) {
        if (object == null) {
            return false;
        }

        if (type.isInstance(object)) {
            return true;
        }

        if (object instanceof String) {
            return type.isAssignableFrom(object.getClass());
        }

        return false;
    }
}
