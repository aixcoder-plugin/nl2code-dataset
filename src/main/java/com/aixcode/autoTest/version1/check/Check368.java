package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder368;
import com.aixcode.autoTest.version1.copilot.Copilot368;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Check368 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot368 solution = new Copilot368();
        Date currentDate = new Date();

        Map<String, Integer> map = new HashMap<>();
        map.put("2022-08-11", 2022);
        map.put("2001-11-11", 2001);
        map.put("1990-11-11", 1990);
        map.put("1900-01-01", 1900);

        int pass_count = 0;
        int total_count = 0;
        try{
            total_count = map.size();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String date = entry.getKey();
                Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                int year = entry.getValue();
                if(solution.getYear(dt) == year){
                    pass_count++;
                }
            }

        }catch (Exception e){

        }
        try{
            total_count++;
            if(solution.getYear(currentDate) == 2022){
                pass_count++;
            }

            total_count++;
            if(solution.getYear(null) == 0){
                pass_count++;
            }
        }catch (Exception e){

        }

        return new int[]{pass_count, total_count};    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder368 solution = new Aixcoder368();
        Date currentDate = new Date();

        Map<String, Integer> map = new HashMap<>();
        map.put("2022-08-11", 2022);
        map.put("2001-11-11", 2001);
        map.put("1990-11-11", 1990);
        map.put("1900-01-01", 1900);

        int pass_count = 0;
        int total_count = 0;
        try{
            total_count = map.size();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String date = entry.getKey();
                Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                int year = entry.getValue();
                if(solution.getYear(dt) == year){
                    pass_count++;
                }
            }

        }catch (Exception e){

        }
        try{
            total_count++;
            if(solution.getYear(currentDate) == 2022){
                pass_count++;
            }

            total_count++;
            if(solution.getYear(null) == 0){
                pass_count++;
            }
        }catch (Exception e){

        }

        return new int[]{pass_count, total_count};
    }
}
