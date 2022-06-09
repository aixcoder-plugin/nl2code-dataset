package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.ArrayList;
import java.util.List;

public class Evaluation170 extends AbstractBaseEvaluation {
    public Evaluation170(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    public List<Integer> years = new ArrayList<>() {
        {
            add(2022);
            add(2022);
            add(2021);
            add(2015);
            add(1985);
        }
    };
    public List<Integer> months = new ArrayList<>() {
        {
            add(6);
            add(2);
            add(9);
            add(6);
            add(2);

        }
    };
    public List<Integer> days = new ArrayList<>() {
        {
            add(7);
            add(1);
            add(8);
            add(8);
            add(28);

        }
    };

    public List<String> dateList = new ArrayList<>() {
        {
            add("2022年5月10日");
            add("2022年1月1日");
            add("2021年8月2日");
            add("2015年4月22日");
            add("1985年1月9日");
        }
    };

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (int i = 0; i < years.size(); i++) {
            try {
                String date = solution.getLunarDate(years.get(i), months.get(i), days.get(i));
                if (dateList.get(i).equals(date)) {
                    passCount++;
                }
            } catch (Exception e) {
            }

        }

        return new int[]{passCount, years.size()};
    }
}
