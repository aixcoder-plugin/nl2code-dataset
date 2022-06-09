package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Evaluation42 extends AbstractBaseEvaluation {


    public Evaluation42(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, -1);
        Date y = calendar.getTime();
        String year = format.format(y);


        int pass_count = 0;
        int total_count = 0;

        try{
            total_count++;
            String lstYearToday = solution.getLastYearDate();
            if(year.equals(lstYearToday)){
                pass_count++;
            }
        }catch (Exception e){

        }

        return new int[]{pass_count,total_count};
    }
}
