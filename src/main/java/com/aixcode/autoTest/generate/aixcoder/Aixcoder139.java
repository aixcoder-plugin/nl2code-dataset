package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Type;

public class Aixcoder139 extends GenerateMethodBase {
    /**
     *   Convert arguments of a method (signature) to an array of Type objects.
     */
    @Override
    public Type[] getArgumentTypes(String signature) {
//        ArrayList vec = new ArrayList();
//        int index;
//        Type[] types;
//
//        try {
//            //Read all declarations between for`('and`)'
//            if (signature.charAt(0) != '(')
//                //throw new ClassFormatException("Invalid method signature:" + signature);
//
//            //current string position
//            index = 1;
//
//            while (signature.charAt(index) != ')') {
//                vec.add(getType(signature.substring(index)));
//                //update position
//                //index += consumed_chars;
//            }
//        } catch (StringIndexOutOfBoundsException e) {
//            //Should never occur
//            //throw new ClassFormatException("Invalid method signature:" + signature);
//        }
//
//        types = new Type[vec.size()];
//        vec.toArray(types);
//        return types;
        //---------undefined: consumed_chars--------
        return null;
    }
}
