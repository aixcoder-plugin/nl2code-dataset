package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Type;



public class GenerateMethod139 extends GenerateMethodBase {
    /**
     *   Convert arguments of a method (signature) to an array of Type objects.
     */
    @Override
    public Type[] getArgumentTypes(String signature) {
        String[] args = signature.split("\\s");
        Type[] types = new Type[args.length];
        for (int i = 0; i < args.length; i++) {
//            types[i] = (Type) getType(args[i]);
        }
        return types;
    }
}
