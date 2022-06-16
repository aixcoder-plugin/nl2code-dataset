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
        map.put("2021-01", "2021-01-31");//1，3，5，7，8，10，12： 31天
        map.put("2022-02", "2022-02-28");//平年02月-29
        map.put("2021-04", "2021-04-30");//4，6，9，11： 30天
        map.put("2020-02", "2020-02-29");//闰年02月-29
        map.put("2022-09", "2022-09-30");//4，6，9，11： 30天

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
