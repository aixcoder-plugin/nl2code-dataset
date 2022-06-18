package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Evaluation39 extends AbstractBaseEvaluation {


    public Evaluation39(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("src/main/resources/tempFile", "Checking");
        map.put("src/main/resources/tempFile/Sub0", "Checking");
        map.put("src/main/resources/tempFile/Sub1", "Checking");

        String nonExistedDir = "hah/notExistedDir/";
        String dirNull = null;

        File file = new File("src/main/resources/tempFile");
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
