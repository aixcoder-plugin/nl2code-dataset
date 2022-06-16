package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Evaluation45 extends AbstractBaseEvaluation {


    public Evaluation45(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Date currentDate = new Date();

        Map<String, Integer> map = new HashMap<>();
        map.put("2022-08-11", 2022);// this year
        map.put("2000-01-01", 2000);// two thousand years 千年虫
        map.put("1990-11-11", 1990);// nineteen century
        map.put("1900-01-01", 1900);// long long ago

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
