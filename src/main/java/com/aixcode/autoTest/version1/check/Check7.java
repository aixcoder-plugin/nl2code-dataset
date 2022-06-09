package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder7;
import com.aixcode.autoTest.version1.copilot.Copilot7;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Check7 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot7 soution = new Copilot7();
        File dir = new File("");
        String filePath1 = new File("src/main/com/aixcode/autoTest/check/Check7.java").getAbsolutePath().replaceAll("\\\\","//");
        String filePath2 = new File("src/main/com/aixcode/autoTest/check/Check11.java").getAbsolutePath().replaceAll("\\\\","//");
        String filePath3 = new File("src/main/com/aixcode/autoTest/check/Check52.java").getAbsolutePath().replaceAll("\\\\","//");
        String filePath4 = new File("src/main/com/aixcode/autoTest/check/Check54.java").getAbsolutePath().replaceAll("\\\\","//");
        String filePath5 = new File("src/main/com/aixcode/autoTest/check/Check34.java").getAbsolutePath().replaceAll("\\\\","//");
        Map<String,Boolean> map = new HashMap<String,Boolean>(){{
            put(filePath1,true);
            put(filePath2,true);
            put(filePath3,true);
            put(filePath4,true);
            put(filePath5,true);
        }};
        int pass_count = 0;
        for(Map.Entry<String,Boolean> entry:map.entrySet()){
            try{
                if((soution.getInputStream(entry.getKey())!=null) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
//        if (1==1){
//            return new int[] {0};
//        }
        Aixcoder7 soution = new Aixcoder7();
        File dir = new File("");
        String filePath1 = new File("src/main/com/aixcode/autoTest/check/Check7.java").getAbsolutePath().replaceAll("\\\\","//");
        String filePath2 = new File("src/main/com/aixcode/autoTest/check/Check11.java").getAbsolutePath().replaceAll("\\\\","//");
        String filePath3 = new File("src/main/com/aixcode/autoTest/check/Check52.java").getAbsolutePath().replaceAll("\\\\","//");
        String filePath4 = new File("src/main/com/aixcode/autoTest/check/Check54.java").getAbsolutePath().replaceAll("\\\\","//");
        String filePath5 = new File("src/main/com/aixcode/autoTest/check/Check34.java").getAbsolutePath().replaceAll("\\\\","//");
        Map<String,Boolean> map = new HashMap<String,Boolean>(){{
            put(filePath1,true);
            put(filePath2,true);
            put(filePath3,true);
            put(filePath4,true);
            put(filePath5,true);
        }};
        int pass_count = 0;
        for(Map.Entry<String,Boolean> entry:map.entrySet()){
            try{
                if((soution.getInputStream(entry.getKey())!=null) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

}
