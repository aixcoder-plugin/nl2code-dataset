package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Evaluation65 extends AbstractBaseEvaluation {


    public Evaluation65(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String, String> map = new HashMap<>();
        map.put("2021-01-01", "2021-01-31");
        map.put("2021-1-1", "2021-01-31");
        map.put("2021-03-1", "2021-03-31");
        map.put("2022-11", "2022-11-30");
        map.put("2022-11-55", "2022-11-30");

        int passCount = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                Date result = solution.getMonthLastDay(entry.getKey());
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
