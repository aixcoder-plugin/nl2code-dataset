package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder344;
import com.aixcode.autoTest.version1.copilot.Copilot344;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class Check344 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot344 solution = new Copilot344();
        Map<String,String> map = new HashMap<String,String>(){{
            put("a","a.txt");
            put("b","b.txt");
            put("c", "c.txt");
            put("d", "d.txt");
            put("e", "e.txt");
        }};
        int pass_count = 0;
        for (Map.Entry<String,String> entry : map.entrySet()){
            try {
                solution.writeToFile(entry.getKey(), entry.getValue());
                File file = new File(entry.getValue());
                if (file.exists()){
                    String content = new String(Files.readAllBytes(file.toPath()));
                    if (content.equals(entry.getKey())){
                        pass_count++;
                    }
                    file.delete();
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder344 solution = new Aixcoder344();
        Map<String,String> map = new HashMap<String,String>(){{
            put("a","a.txt");
            put("b","b.txt");
            put("c", "c.txt");
            put("d", "d.txt");
            put("e", "e.txt");
        }};
        int pass_count = 0;
        for (Map.Entry<String,String> entry : map.entrySet()){
            try {
                solution.writeToFile(entry.getKey(), entry.getValue());
                File file = new File(entry.getValue());
                if (file.exists()){
                    String content = new String(Files.readAllBytes(file.toPath()));
                    if (content.equals(entry.getKey())){
                        pass_count++;
                    }
                    file.delete();
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
