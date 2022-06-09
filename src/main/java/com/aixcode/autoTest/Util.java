package com.aixcode.autoTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<String> listFiles(String path) {
        File file = new File(path);
        List<String> res = new ArrayList<String>();
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isDirectory())
                res.add(files[i].getName());
        }
        return res;
    }
}
