package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Evaluation146 extends AbstractBaseEvaluation {
    public Evaluation146(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String className = "com.aixcode.autoTest.Excutor";
            Set<String> methods = solution.getMethods(classLoader, className);
            Set<String> targetMethods = caconicalSolution(classLoader, className);
            if ((targetMethods == null || targetMethods.size() == 0) && (methods == null || methods.size() == 0)) {
                passCount++;
            } else if (targetMethods != null && targetMethods.size() != 0) {
                if (methods.size() == targetMethods.size() && methods.containsAll(targetMethods)) {
                    passCount++;
                }

            }

        } catch (Exception e) {

        }
        return new int[]{passCount, 1};
    }

    private Set<String> caconicalSolution(ClassLoader classLoader, String className) {
        Set<String> methods = new HashSet<String>();
        try {

            Class<?> clazz = classLoader.loadClass(className);
            if (clazz != null) {
                Method[] methodsArray = clazz.getMethods();
                for (Method method : methodsArray) {
                    methods.add(method.getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return methods;
    }

}
