package com.aixcode.autoTest.version1.aixcoder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Aixcoder395 {
    public static List<String> getFiles(String dir) {
        List<String> list = new ArrayList<String>();
        File file = new File(dir);

        if (!file.exists()) {
            return list;
        }

        File[] files = file.listFiles();

        if (files == null) {
            return list;
        }

        for (File f : files) {
            if (f.isFile()) {
                list.add(f.getName());
            }
        }

        return list;
    }
}
