package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder302;
import com.aixcode.autoTest.version1.copilot.Copilot302;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Check302 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Map<String, String> map = new HashMap<>();
        map.put("2021-01-01", "2021-01-31");
        map.put("2021-1-1", "2021-01-31");
        map.put("2021-03-1", "2021-03-31");
        map.put("2022-11", "2022-11-30");
        map.put("2022-11-55", "2022-11-30");

        int passCount = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                Date result = Copilot302.getMonthLastDay(entry.getKey());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String resultStr = simpleDateFormat.format(result);
                if (resultStr.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {

            }
        }
        return new int[]{passCount, map.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Map<String, String> map = new HashMap<>();
        map.put("2021-01-01", "2021-01-31");
        map.put("2021-1-1", "2021-01-31");
        map.put("2021-03-1", "2021-03-31");
        map.put("2022-11", "2022-11-30");
        map.put("2022-11-55", "2022-11-30");

        int passCount = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                Date result = Aixcoder302.getMonthLastDay(entry.getKey());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String resultStr = simpleDateFormat.format(result);
                if (resultStr.equals(entry.getValue())) {
                    passCount++;
                }
            } catch (Exception e) {

            }
        }
        return new int[]{passCount, map.size()};
    }
}
