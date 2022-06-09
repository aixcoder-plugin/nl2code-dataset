package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AixcoderNew76 extends GenerateMethodBase {
    public List<String> getClassFileNames(String filepath) {
// class文件的全路径
        List<String> classNames = new ArrayList<String>();
        File file = new File(filepath);
        File[] tempList = file.listFiles();
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile() && tempList[i].getName().endsWith(".class")) {
                classNames.add(tempList[i].toString());
            }
            if (tempList[i].isDirectory()) {
// 判断是否为文件夹
                List<String> list = getClassFileNames(filepath + "/" + tempList[i].getName());
                classNames.addAll(list);
            }
        }
        return classNames;
    }
}
