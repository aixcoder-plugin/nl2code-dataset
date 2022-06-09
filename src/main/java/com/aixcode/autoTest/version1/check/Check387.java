package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder387;
import com.aixcode.autoTest.version1.copilot.Copilot387;

import java.util.HashMap;
import java.util.Map;

public class Check387 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot387 solution=new Copilot387();
        int pass_count = 0;

        Map<Character, Boolean> map = new HashMap<>();
        map.put('a', true);
        map.put('Z', true);
        map.put('A', true);
        map.put('z', true);
        map.put('4', false);
        map.put('\0', false);
        map.put('\\', false);

        for(Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if(solution.isLetter(entry.getKey()) == entry.getValue()) {
                pass_count++;
            }
        }
        return new int[]{pass_count, map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder387 solution=new Aixcoder387();
        int pass_count = 0;

        Map<Character, Boolean> map = new HashMap<>();
        map.put('a', true);
        map.put('Z', true);
        map.put('A', true);
        map.put('z', true);
        map.put('4', false);
        map.put('\0', false);
        map.put('\\', false);

        for(Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if(solution.isLetter(entry.getKey()) == entry.getValue()) {
                pass_count++;
            }
        }
        return new int[]{pass_count, map.size()};
    }
}
