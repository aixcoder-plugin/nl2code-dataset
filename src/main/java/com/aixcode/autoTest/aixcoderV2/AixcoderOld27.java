package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.annotation.Annotation;
public class AixcoderOld27 extends GenerateMethodBase {
    public String getInterfaceName(Class<?> clazz, Class<? extends Annotation> annotation) {
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
