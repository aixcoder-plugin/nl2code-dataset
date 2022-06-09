package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateMethod76 extends GenerateMethodBase {
    /**
     * 得到filepath路径下第一层目录结构中所有的class文件
     */
    public List<String> getClassFileNames(String filepath) {
        List<String> classFileNames = new ArrayList<String>();
        File file = new File(filepath);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                classFileNames.addAll(getClassFileNames(f.getAbsolutePath()));
            } else {
                if (f.getName().endsWith(".class")) {
                    classFileNames.add(f.getAbsolutePath());
                }
            }
        }
        return classFileNames;
    }
}
