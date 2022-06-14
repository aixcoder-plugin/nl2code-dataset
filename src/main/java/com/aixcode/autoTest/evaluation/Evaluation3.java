package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.nio.file.Files;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Evaluation3 extends AbstractBaseEvaluation {


    public Evaluation3(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        String randomStr = new Date().getTime() + "";
        Map<String,String> map = new HashMap<String,String>(){{
            put("a","a.txt");
            put("# title \n test","b.md");
            put("<html></html>", "c.html");
            put("", "d.css");
            put("print('hello world')", randomStr + "e.py");
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
