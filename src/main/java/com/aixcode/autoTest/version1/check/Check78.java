package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder78;
import com.aixcode.autoTest.version1.copilot.Copilot78;

import java.util.HashMap;
import java.util.Map;

public class Check78 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot78 solution=new Copilot78();
        Map<String, Object> Map1 = new HashMap<String, Object>();
        Map1.put("key1", "value1");
        Map1.put("key2", 44);
        Map1.put("key3", true);
        Map1.put("key4", 'C');

        Map<Integer, Object> Map2 = new HashMap<Integer, Object>();
        Map2.put(123, "value1");
        Map2.put(1, 44);
        Map2.put(0, true);
        Map2.put(111, 'C');

        Map<Object, Object> Map3 = new HashMap<Object, Object>();
        Map3.put("123", "value1");
        Map3.put(1, 44);
        Map3.put(false, true);
        Map3.put('S', 'C');

        int pass_count = 0;
        int total_count = 0;

        total_count++;
        try {
            if (solution.getEntry(Map1, "Key1").getKey().equals("Key1")) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        total_count++;
        try {
            if (solution.getEntry(Map1, "Key5") == null) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        total_count++;
        try {
            if (solution.getEntry(Map2, 123).getKey().equals(123)) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        total_count++;
        try {
            if (solution.getEntry(Map2, 12) == null) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        total_count++;
        try {
            if (solution.getEntry(Map3, 'S').getKey().equals((Object)'S')) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        total_count++;
        try {
            if (solution.getEntry(Map3, false).getKey().equals((Object)false)) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new int[]{pass_count, total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder78 solution=new Aixcoder78();
        Map<String, Object> Map1 = new HashMap<String, Object>();
        Map1.put("key1", "value1");
        Map1.put("key2", 44);
        Map1.put("key3", true);
        Map1.put("key4", 'C');

        int pass_count = 0;
        int total_count = 0;

        total_count++;
        try {
            if (solution.getEntry(Map1, "Key1").getKey().equals("Key1")) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        total_count++;
        try {
            if (solution.getEntry(Map1, "Key5") == null) {
                pass_count++;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }

        return new int[]{pass_count, total_count};
    }
}
