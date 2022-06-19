package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class AixcoderOld126 extends GenerateMethodBase {
    public void unzip(String zipPath, String destDirPath)
            throws IOException {
        InputStream zipIn = new FileInputStream(zipPath);
        byte[] buf = new byte[8192];
        File destDir = new File(destDirPath);
        String canonicalDestDirPath = destDir.getCanonicalPath();
        ZipInputStream zis = new ZipInputStream(zipIn);
        FileOutputStream fos = null;
        try {
            ZipEntry zEntry;
            while ((zEntry = zis.getNextEntry()) != null) {
// if it is empty directory, create it
                if (zEntry.isDirectory()) {
                    new File(destDir, zEntry.getName()).mkdirs();
                    continue;
                }
// if it is a file, extract it
                String filePath = "";
                int lastSeparator = filePath.lastIndexOf("/");
                String fileDir = "";
                if (lastSeparator >= 0) {
                    fileDir = filePath.substring(0, lastSeparator);
                }
// create directory for a file
                new File(destDir, fileDir).mkdirs();
// write file
                File outFile = new File(destDir, filePath);
                fos = new FileOutputStream(outFile);
                int n = 0;
                while ((n = zis.read(buf)) >= 0) {
                    fos.write(buf, 0, n);
                }
                fos.close();
            }
        } catch (IOException ioe) {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ioe2) {
                }
            }
        } finally {
            try {
                zipIn.close();
                if (zis != null)
                    zis.close();
            } catch (IOException ioe) {
            }
        }
    }
}
