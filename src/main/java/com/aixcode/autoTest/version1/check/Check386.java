package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder386;
import com.aixcode.autoTest.version1.copilot.Copilot386;

import java.util.HashMap;
import java.util.Map;

public class Check386 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot386 solution=new Copilot386();
        int pass_count = 0;
        Map<String, Boolean> map = new HashMap<>();
        map.put("abcdefghijklmnopqrstuvwxyz", true);//lower case letters
        map.put("ABCDEFGHIJKLMNOPQRSTUVWYXZ", true);//upper case alphabet
        map.put("1234567890", true);//digits
        map.put("MIaoXW0921", true);//mix
        map.put("miaoxw@163.com", false);
        map.put("I\0\nU", false);
        map.put("\\localPath\\xxx.txt", false);

        for(Map.Entry<String, Boolean> entry : map.entrySet()) {
            if(solution.isLetterOrDigit(entry.getKey()) == entry.getValue()) {
                pass_count++;
            }
        }
        return new int[]{pass_count, map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder386 solution=new Aixcoder386();
        int pass_count = 0;
        Map<String, Boolean> map = new HashMap<>();
        map.put("abcdefghijklmnopqrstuvwxyz", true);//lower case letters
        map.put("ABCDEFGHIJKLMNOPQRSTUVWYXZ", true);//upper case alphabet
        map.put("1234567890", true);//digits
        map.put("MIaoXW0921", true);//mix
        map.put("miaoxw@163.com", false);
        map.put("I\0\nU", false);
        map.put("\\localPath\\xxx.txt", false);

        for(Map.Entry<String, Boolean> entry : map.entrySet()) {
            if(solution.isLetterOrNumer(entry.getKey()) == entry.getValue()) {
                pass_count++;
            }
        }
        return new int[]{pass_count, map.size()};
    }
}
