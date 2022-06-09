package com.aixcode.autoTest.version1.aixcoder;

import java.lang.annotation.Annotation;

public class Aixcoder91 {
    /**
     * 获取类上具有指定注解的接口的名称，如果有多个，则以第一个为准 找不到符合条件的接口则返回 clazz 类的名称
     */
    public static String getInterfaceName(Class<?> clazz, Class<? extends Annotation> annotation) {
        if (clazz == null) {
            return null;
        }

        String interfaceName = null;
        Class<?>[] interfaces = clazz.getInterfaces();

        if (interfaces == null || interfaces.length == 0) {
            return interfaceName;
        }

        for (Class<?> itfc : interfaces) {
            if (itfc.isAnnotationPresent(annotation)) {
                interfaceName = itfc.getName();
            }
        }

        if (interfaceName == null || interfaceName.length() == 0) {
            return interfaceName;
        }

        return interfaceName;
    }
}
