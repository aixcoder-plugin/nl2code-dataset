package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileOutputStream;

public class GenerateMethod81 extends GenerateMethodBase {
    /**
     * 上传一个文件至指定路径pathname下
     */
    public void uploadFile(String pathname, String filename) {
        try {
            File file = new File(pathname);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fos = new FileOutputStream(pathname + filename);
            fos.write(filename.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
