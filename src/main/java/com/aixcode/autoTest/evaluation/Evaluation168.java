package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Evaluation168 extends AbstractBaseEvaluation {
    public Evaluation168(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        try {
            List<String> weekDate = getWeekDate();
            List<String> methodDate = solution.getWeekDate();
            if (weekDate.size() == methodDate.size()) {
                boolean isSame = true;
                for (int i = 0; i < weekDate.size(); i++) {
                    if (!weekDate.get(i).equals(methodDate.get(i))) {
                        isSame=false;
                        break;
                    }
                }
                if (isSame) {
                    passCount++;
                }
            }
        }catch (Exception e){

        }
        return new int[]{passCount,1};
    }

    public static void main(String[] args) {
        System.out.println(getWeekDate());
    }

    public static List<String> getWeekDate() {
        List<String> dates = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        for (int i = 0; i < 7; i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR,  - i);
            dates.add(simpleDateFormat.format(calendar.getTime()));
        }
        return dates;
    }

}
