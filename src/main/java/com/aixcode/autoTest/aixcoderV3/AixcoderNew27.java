package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.annotation.Annotation;

public class AixcoderNew27 extends GenerateMethodBase {
    public String getInterfaceName(Class<?> clazz, Class<? extends Annotation> annotation) {
        if (clazz == null) {
            return null;
        }
        String interfaceName = null;
        for (Class<?> ifc : clazz.getInterfaces()) {
            if (ifc.isAnnotationPresent(annotation)) {
                if (interfaceName != null) {
                    return null;
                }
                interfaceName = ifc.getName();
            }
        }
        if (clazz.getSuperclass() != null && !clazz.getSuperclass().equals(Object.class)) {
            return getInterfaceName(clazz.getSuperclass(), annotation);
        }
        return interfaceName;
    }
}
