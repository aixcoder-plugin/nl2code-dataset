package com.aixcode.autoTest.version1.copilot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Copilot328 {
    /**
     * 打开文件filename，并返回文件输入流
     */
    public static FileInputStream openFile(String filename) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            // ignore this exception
//            e.printStackTrace();
        }
        return fis;
    }
}
