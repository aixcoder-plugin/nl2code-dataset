package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Type;
import java.util.ArrayList;


public class AixcoderOld139 extends GenerateMethodBase {
    public Type[] getArgumentTypes(String signature) {
        ArrayList vec = new ArrayList();
        int index;
        Type[] types;
//        try {
//// Read all declarations between for `(' and `)'
//            if (signature.charAt(0) != '(')
//                throw new RuntimeException("Invalid method signature: " + signature);
//// current string position
//            index = 1;
//            while (signature.charAt(index) != ')') {
//                vec.add(getType(signature.substring(index)));
//// update position
//                index += consumed_chars;
//            }
//        } catch (StringIndexOutOfBoundsException e) {
//// Should never occur
//            throw new RuntimeException("Invalid method signature: " + signature);
//        }
//        types = new Type[vec.size()];
//        vec.toArray(types);
        return null;
    }
}
