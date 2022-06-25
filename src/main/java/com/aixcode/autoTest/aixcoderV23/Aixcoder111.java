package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder111 extends GenerateMethodBase {
    public boolean isWindowsAbsolutePath(String path) {
//        if (!isAbsolutePath(path))
//            return false;
// On Windows, an absolute path starts with "[drive_letter]:\".
        if (path.length() > 2 && path.charAt(1) == ':' && Character.isLetter(path.charAt(0)) && (path.charAt(2) == '\\' || path.charAt(2) == '/'))
            return true;
        else
            return false;
    }
}
