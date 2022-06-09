package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public class GenerateMethod114 extends GenerateMethodBase {

    /**
     * Check whether a file is actually a valid zip
     */
    public boolean isValidZip(File zip) {
        try {
            ZipFile zipFile = new ZipFile(zip);
            return true;
        } catch (IOException e) {
            return false;
        }
    }


}
