package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.FileInputStream;

public class AixcoderOld81 extends GenerateMethodBase {
    public void uploadFile(String pathname, String filename)
            throws Exception {
        File file = new File(pathname);
        if (!file.exists()) {
            throw new Exception("文件不存在");
        }
        FileInputStream fis = new FileInputStream(file);
//        this.client.setFileType(FTPClient.BINARY_FILE_TYPE);
//        this.client.storeFile(filename, fis);
        fis.close();
    }
}
