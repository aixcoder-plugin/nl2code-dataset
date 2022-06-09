package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder338;
import com.aixcode.autoTest.version1.copilot.Copilot338;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Check338 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot338 solution = new Copilot338();
        Map<String, String> map = new HashMap<String, String>();
        map.put("src/main/com/aixcode/resource/tempFile", "Checking");
        map.put("src/main/com/aixcode/resource/tempFile/Sub0", "Checking");
        map.put("src/main/com/aixcode/resource/tempFile/Sub1", "Checking");

        String nonExistedDir = "hah/notExistedDir/";
        String dirNull = null;

        File file = new File("src/main/com/aixcode/resource/tempFile");
        if (!file.isDirectory()) {
            file.mkdir();
        }

        int pass_count = 0;
        int total_count = 0;

        total_count = map.size();
        for (String key : map.keySet()) {
            try {
                String fileName = solution.generateTempFile(key);
                if (new File(fileName).exists()) {
                    pass_count++;
                }
            }
            catch (Exception e) {
                continue;
            }
        }

        total_count++;
        try {
            solution.generateTempFile(nonExistedDir);
            pass_count++;
        }catch (Exception e) {

        }

        total_count++;
        try {
            solution.generateTempFile(dirNull);
            pass_count++;
        }catch (Exception e) {

        }
        return new int[]{pass_count, total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder338 solution = new Aixcoder338();
        Map<String, String> map = new HashMap<String, String>();
        map.put("/Users/edy/Documents/miaoxw/", "Checking");
        map.put("/Users/edy/Documents/miaoxw/text/", "Checking");
        map.put("/Users/edy/Documents/miaoxw/text/sub/", "Checking");

        String nonExistedDir = "hah/notExistedDir/";
        String dirNull = null;

        File file = new File("/Users/edy/Documents/miaoxw/");
        if (!file.isDirectory()) {
            file.mkdir();
        }

        int pass_count = 0;
        int total_count = 0;

        total_count = map.size();
        for (String key : map.keySet()) {
            try {
                String fileName = solution.generateTempFile(key);
                if (new File(fileName).exists()) {
                    pass_count++;
                }
            }
            catch (Exception e) {
                continue;
            }
        }

        total_count++;
        try {
            solution.generateTempFile(nonExistedDir);
            pass_count++;
        }catch (Exception e) {

        }

        total_count++;
        try {
            solution.generateTempFile(dirNull);
            pass_count++;
        }catch (Exception e) {

        }
        return new int[]{pass_count, total_count};
    }
}
