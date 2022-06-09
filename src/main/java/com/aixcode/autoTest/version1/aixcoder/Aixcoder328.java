package com.aixcode.autoTest.version1.aixcoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Aixcoder328 {
    /**
     * 打开文件filename，并返回文件输入流
     */
    public static FileInputStream openFile(String filename) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            // ignore this exception
//            e.printStackTrace();
        }

        return fileInputStream;
    }
}
