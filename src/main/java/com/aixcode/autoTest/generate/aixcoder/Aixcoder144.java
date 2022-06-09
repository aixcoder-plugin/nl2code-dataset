package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.IOException;

public class Aixcoder144 extends GenerateMethodBase {
    public void extractAll(String destPath, String zipName) throws IOException {
//        File zipFile = new File(zipName);
//
//        if (zipFile.exists()) {
//            if (zipFile.isDirectory()) {
//                String msg = "Zip file[" + zipName + "] exists but is a directory";
//                throw new IOException(msg);
//            }
//
//            if (!zipFile.canRead()) {
//                String msg = "Zip file[" + zipName + "] cannot be read";
//                throw new IOException(msg);
//            }
//        } else {
//            String msg = "Zip file[" + zipName + "] does not exist";
//            throw new IOException(msg);
//        }
//
//        Enumeration<? extends ZipEntry> zipEntries = zipFile.entries();
//
//        while (zipEntries.hasMoreElements()) {
//            ZipEntry entry = zipEntries.nextElement();
//            String entryName = entry.getName();
//            File destFile = new File(destPath, entryName);
//
//            if (!destFile.getParentFile().exists()) {
//                String msg = "Extracted file[" + entryName + "] does not exist or is not readable";
//                throw new IOException(msg);
//            }
//
//            if (!destFile.getParentFile().isDirectory()) {
//                String msg = "Extracted file[" + entryName + "] is not a directory";
//                throw new IOException(msg);
//            }
//
//            if (!destFile.getParentFile().canWrite()) {
//                String msg = "Extracted file[" + entryName + "] is not writable";
//                throw new IOException(msg);
//            }
//
//            if (entry.isDirectory()) {
//                String msg = "Extracted file[" + entryName + "] is a directory";
//                throw new IOException(msg);
//            }
//
//            if (!entry.canRead()) {
//                String msg = "Extracted file[" + entryName + "] cannot be read";
//                throw new IOException(msg);
//            }
//
//            try(InputStream in = zipFile.getInputStream(entry);
//                FileOutputStream out = new FileOutputStream(destFile)) {
//                byte[] buffer = new byte[1024];
//                int read;
//
//                while ((read = in.read(buffer)) != -1) {
//                    out.write(buffer, 0, read);
//                }
//            }
//        }
    }
}
