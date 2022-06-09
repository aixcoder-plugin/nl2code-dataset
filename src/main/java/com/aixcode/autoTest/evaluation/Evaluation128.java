package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Evaluation128 extends AbstractBaseEvaluation {

    public Evaluation128(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        String dateStr=  "2022-06-06 12:48:23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Map<Integer,Integer> map = new HashMap<>(){{
            put(1, 0); //年
            put(2, 52); //月
            put(11, 0); //时
            put(12, 0); //分
            put(13, 0); //秒
        }};
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            try {
                if (entry.getKey() == Calendar.YEAR){
                    if (solution.clearTo(calendar , entry.getKey()+1).get(entry.getKey()+2) == entry.getValue()){
                        pass_count++;
                    }
                }else{
                    if (solution.clearTo(calendar , entry.getKey()+1).get(entry.getKey()+1) == entry.getValue()){
                        pass_count++;
                    }
                }

            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
