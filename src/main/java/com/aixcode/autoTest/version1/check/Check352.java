package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder352;
import com.aixcode.autoTest.version1.copilot.Copilot352;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Check352 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot352 solution=new Copilot352();
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

    @Override
    public int[] checkAixcoder() {
        Aixcoder352 solution=new Aixcoder352();
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
