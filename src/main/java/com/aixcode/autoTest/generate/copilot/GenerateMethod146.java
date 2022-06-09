package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashSet;
import java.util.Set;

public class GenerateMethod146 extends GenerateMethodBase {
    /**
     * Returns a set with all unique methodNames of methods.
     */
    public Set<String> getMethods(ClassLoader classLoader, String className) {
        Set<String> methods = new HashSet<String>();
//        Class<?> clazz = getClass(classLoader, className);
//        if (clazz != null) {
//            Method[] methodsArray = clazz.getMethods();
//            for (Method method : methodsArray) {
//                methods.add(method.getName());
//            }
//        }
        return methods;
    }
}
