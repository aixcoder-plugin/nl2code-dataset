package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.*;

public class Evaluation70 extends AbstractBaseEvaluation {

    public Evaluation70(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    private Map<List<Calendar>, Long> init() {
        Map<List<Calendar>, Long> map = new HashMap<>();
        List<Calendar> input1 = new LinkedList<>();
        input1.add(getCalendar(2022, 1, 1, 1, 12, 1));
        input1.add(getCalendar(2022, 1, 1, 1, 13, 1));
        map.put(input1, 60 * 1000L);

        List<Calendar> input2 = new LinkedList<>();
        input2.add(getCalendar(2022, 1, 1, 1, 12, 1));
        input2.add(getCalendar(2022, 1, 1, 1, 12, 2));
        map.put(input2, 1000L);
        List<Calendar> input3 = new LinkedList<>();
        input3.add(getCalendar(2021, 12, 11, 1, 0, 0));
        input3.add(getCalendar(2021, 12, 11, 2, 0, 0));
        map.put(input3, 60 * 60 * 1000L);

        return map;
    }

    private Calendar getCalendar(int year, int month, int day, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(year, month, day, hour, minute, second);
        return calendar;
    }

    @Override
    public int[] evaluation() {
        Map<List<Calendar>, Long> map = init();
        int passCount = 0;

        for (Map.Entry<List<Calendar>, Long> entry : map.entrySet()) {
            try {
                long result = solution.elapsedTime(entry.getKey().get(0), entry.getKey().get(1));
                if (result == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {
                System.out.println(1);
            }
        }
        return new int[]{passCount, map.size()};
    }
}
