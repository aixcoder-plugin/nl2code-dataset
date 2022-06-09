package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation36 extends AbstractBaseEvaluation {
    private Map<String, String> sourceMap = new HashMap<>();

    public Evaluation36(String basePackage, String prefix) {
        super(basePackage, prefix);
        sourceMap.put("Aixcoder300.java", "src/com/aixcode/autoTest/aixcoder/Aixcoder300.java");//相对路径
        sourceMap.put("windowsFile.jpg", "C:/windowsFile.jpg");//Windows 绝对路径
        sourceMap.put("macFile.txt", "/Users/xxx/macFile.txt"); //Mac 绝对路径
        sourceMap.put("noPath.svg", "noPath.svg"); //没有路径
        sourceMap.put("", "");  //空字符串
    }


    @Override
    public int[] evaluation() {
        int pass_count = 0;
        int total_count = sourceMap.size();

        for(Map.Entry<String, String> entry : sourceMap.entrySet()) {
            String expectedFName = entry.getKey();
            try {
                String actualFName = solution.extractFileName(entry.getValue());
                if (expectedFName.equals(actualFName)) {
                    pass_count++;
                }
            } catch (Exception e) {
                continue;
            }
        }
        try {
            total_count++;
            solution.extractFileName(null);
            pass_count++;
        }catch (Exception e) {

        }
        return new int[]{pass_count,total_count};
    }
}
