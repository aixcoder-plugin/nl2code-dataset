package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AixcoderNew83 extends GenerateMethodBase {
    public List<String> getFiles(String dir) {
        List<String> files = new ArrayList<>();
        if (!dir.endsWith("/"))
            dir = dir + "/";
        File p = new File(dir);
        if (!p.exists())
            p.mkdirs();
        File[] listFiles = p.listFiles();
        if (listFiles != null)
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile())
                    files.add(listFiles[i].getName());
            }
        return Collections.unmodifiableList(files);
    }
}
