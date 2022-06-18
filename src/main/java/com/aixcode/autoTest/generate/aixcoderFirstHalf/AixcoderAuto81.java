package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AixcoderAuto81 extends GenerateMethodBase {
    public void uploadFile(String pathname, String filename) {
        try {
            File file = new File(pathname);

            if (!file.exists()) {
                file.mkdirs();
            }

            String filepath = file.getAbsolutePath() + File.separator + filename;
            File file1 = new File(filepath);
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(filepath);
            byte[] buf = new byte[1024];
            int len;

            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }

            fos.close();
            fis.close();
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}
