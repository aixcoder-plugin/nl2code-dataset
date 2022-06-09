package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AixcoderAuto76 extends GenerateMethodBase {
    /**
     * 得到filepath路径下第一层目录结构中所有的class文件
     */
    public List<String> getClassFileNames(String filepath) {
        File file = new File(filepath);
        List<String> list = new ArrayList<String>();

        if (file.exists()) {
            File[] listFiles = file.listFiles();

            for (File listFile : listFiles) {
                if (listFile.isDirectory()) {
                    list.addAll(getClassFileNames(listFile.getPath()));
                } else {
                    String filename = listFile.getName();

                    if (filename.endsWith(".class")) {
                        list.add(filename);
                    }
                }
            }
        }

        return list;
    }
}
