package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class AixcoderOld163 extends GenerateMethodBase {
    public void move(Path src, Path dest)
            throws IOException {
//        File fs = new File()
//        if (!fs.isDirectory(src)) {
//// source is a file
//            fs.rename(src, dest);
//            return;
//        }
//        if (fs.isDirectory(dest)) {
//            dest = new Path(dest, src.getName());
//        }
//        FileStatus[] srcs = listStatus(src);
//        if (srcs.length == 0) {
//            throw new IOException("Cannot rename empty directory: " + src);
//        }
//        if (fs.isDirectory(dest)) {
//            dest = new Path(dest, src.getName());
//        }
//        if (!fs.mkdirs(dest.getParent())) {
//            throw new IOException("Cannot create directory: " + dest.getParent());
//        }
//        boolean succeeded = false;
//        try {
//            for (int i = 0; i < srcs.length; i++) {
//                fs.rename(srcs[i].getPath(), dest);
//                succeeded = true;
//            }
//        } finally {
//            if (!succeeded) {
//// remove the destination directory before copy in case of exception
//                fs.delete(dest, true);
//            }
//        }
    }
}
