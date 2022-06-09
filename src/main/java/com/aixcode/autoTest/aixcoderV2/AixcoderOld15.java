package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.*;

public class AixcoderOld15 extends GenerateMethodBase {
    public void copyFile(String sourcePath, String destPath)
            throws IOException {
        if (!sourcePath.endsWith("/")) {
            sourcePath += "/";
        }
        if (!destPath.endsWith("/")) {
            destPath += "/";
        }
        if (!sourcePath.startsWith(destPath)) {
            throw new IOException("source does not exist or is not a file");
        }
        File sourceFile = new File(sourcePath);
        if (sourceFile.exists()) {
            sourceFile.delete();
        }
        if (sourceFile.isDirectory()) {
            String[] listFile = sourceFile.list();
            if (listFile != null) {
                for (int i = 0; i < listFile.length; i++) {
                    String destSubPath = destPath + listFile[i];
                    String sourceSubPath = sourcePath + listFile[i];
                    copyFile(sourceSubPath, destSubPath);
                }
            }
        } else {
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                byte[] buf = new byte[1024];
                int bytesRead;
                bis = new BufferedInputStream(new FileInputStream(sourceFile));
                bos = new BufferedOutputStream(new FileOutputStream(destPath));
                while ((bytesRead = bis.read(buf)) != -1) {
                    bos.write(buf, 0, bytesRead);
                }
            } catch (IOException e) {
                throw e;
            } finally {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            }
        }
    }
}
