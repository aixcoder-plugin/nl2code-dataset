package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder383;
import com.aixcode.autoTest.version1.copilot.Copilot383;

import java.util.HashMap;
import java.util.Map;

public class Check383 extends BaseAbstractTest {
    private Map<String, int[]> globalMap;
    public Check383() {
        this.globalMap = new HashMap<>();
        this.globalMap.put("normal1", new int[]{1});
        this.globalMap.put("normal2", new int[]{11111,22222,33333,44444,55555,66666,77777,88888,99999});
        this.globalMap.put("normal3", new int[10]);
        this.globalMap.put("empty", new int[0]);
        this.globalMap.put("null", null);
    }

    @Override
    public int[] checkCopilot() {
        Copilot383 solution = new Copilot383();
        int pass_count = 0;
        for(Map.Entry<String, int[]> testRow : this.globalMap.entrySet()) {
            String key = testRow.getKey();
            Integer[] res = solution.toObjectArray(testRow.getValue());
            boolean isSame = true;
            try {
                if (key.startsWith("normal")) {
                    for (int i = 0; i < res.length; i++) {
                        if (res[i] != testRow.getValue()[i]) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) {
                        pass_count++;
                    }
                }else if(key.startsWith("empty")){
                    if(res.length == 0){
                        pass_count++;
                    }
                }else if(key.startsWith("null")){
                    if(res == null){
                        pass_count++;
                    }
                }
            } catch (Exception e) {

            }

        }
        return new int[]{pass_count,this.globalMap.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder383 solution = new Aixcoder383();
        int pass_count = 0;
        for(Map.Entry<String, int[]> testRow : this.globalMap.entrySet()) {
            String key = testRow.getKey();
            try {
                Integer[] res = solution.toObjectArray(testRow.getValue());
                boolean isSame = true;

                if (key.startsWith("normal")) {
                    for (int i = 0; i < res.length; i++) {
                        if (res[i] != testRow.getValue()[i]) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) {
                        pass_count++;
                    }
                } else if (key.startsWith("empty")) {
                    if (res.length == 0) {
                        pass_count++;
                    }
                } else if (key.startsWith("null")) {
                    if (res == null) {
                        pass_count++;
                    }
                }
            } catch (Exception e) {

            }

        }
        return new int[]{pass_count,this.globalMap.size()};
    }
}
