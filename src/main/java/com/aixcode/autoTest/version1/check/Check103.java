package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder103;
import com.aixcode.autoTest.version1.copilot.Copilot103;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Check103 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        File dir = new File("");
        String dirPath1 = dir.getAbsoluteFile().getPath();
        String dirPath2 = dirPath1+"/src/com/aixcode/Main";
        String dirPath3 = dirPath1+"/src/com/aixcode/resource";
        String dirPath4 = dirPath1+"/src/com/aixcode/check";
        String dirPath5 = dirPath1+"/src/com/aixcode/copilot";
        Copilot103 solution=new Copilot103();
        Map<String,Integer> map = new HashMap<String,Integer>(){{
            put(dirPath1,0);
            put(dirPath2,0);
            put(dirPath3,0);
            put(dirPath4,0);
            put(dirPath5,0);
        }};

        int pass_count = 0;

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            try{
                if(solution.getBackupFiles(entry.getKey()).size() == entry.getValue()){
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
        File dir = new File("");
        String dirPath1 = dir.getAbsoluteFile().getPath();
        String dirPath2 = dirPath1+"/src/com/aixcode/Main";
        String dirPath3 = dirPath1+"/src/com/aixcode/resource";
        String dirPath4 = dirPath1+"/src/com/aixcode/check";
        String dirPath5 = dirPath1+"/src/com/aixcode/copilot";
        Aixcoder103 solution=new Aixcoder103();
        Map<String,Integer> map = new HashMap<String,Integer>(){{
            put(dirPath1,0);
            put(dirPath2,0);
            put(dirPath3,0);
            put(dirPath4,0);
            put(dirPath5,0);
        }};

        int pass_count = 0;

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            try{
                if(solution.getBackupFiles(entry.getKey()).size() == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
