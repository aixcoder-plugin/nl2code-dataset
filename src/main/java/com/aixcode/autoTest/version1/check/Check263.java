package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder263;
import com.aixcode.autoTest.version1.copilot.Copilot263;

import java.util.HashMap;
import java.util.Map;

public class Check263 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot263 solution = new Copilot263();
        String[] alphabet = {"abcd","efgh","ijkl","1234","7890"};

        int length = 10;
        Map<Integer,String> map = new HashMap<Integer,String>(){{
            put(0,"x");
            put(1,"y");
            put(2,"z");
            put(3,"5");
            put(4,"6");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                if(!solution.randomString(length,alphabet[entry.getKey()]).contains(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder263 solution = new Aixcoder263();
        String[] alphabet = {"abcd","efgh","ijkl","1234","7890"};

        int length = 10;
        Map<Integer,String> map = new HashMap<Integer,String>(){{
            put(0,"x");
            put(1,"y");
            put(2,"z");
            put(3,"5");
            put(4,"6");
        }};
        int pass_count = 0;

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            try{
                if(!solution.randomString(length,alphabet[entry.getKey()]).contains(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
