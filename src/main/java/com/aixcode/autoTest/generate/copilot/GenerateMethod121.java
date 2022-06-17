package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod121 extends GenerateMethodBase {

    /**
     * Get the index of the next slash.
     */
    public int getNextSlash(String path, int index) {
        int slashIndex = path.indexOf('/', index);
        if (slashIndex == -1) {
            return path.length();
        }
        return slashIndex;
    }

//    public static void main(String[] args) {
//        System.out.println(new GenerateMethod121().getNextSlash("",1));
//    }
}
