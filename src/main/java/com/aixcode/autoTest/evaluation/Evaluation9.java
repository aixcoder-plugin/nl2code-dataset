package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Evaluation9 extends AbstractBaseEvaluation {


    public Evaluation9(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        try {
            DateFormat format =  new SimpleDateFormat( "yyyy-MM-dd");
            Date date1 = format.parse("2022-01-01");
            Date date2 = format.parse("2022-01-02");
            Date date3 = format.parse("2022-01-03");
            Date date4 = format.parse("2022-01-04");
            Date date5 = format.parse("2022-01-05");
            Map<Date,String> map = new HashMap<Date, String>(){{
                put(date1,"2022-01-01");
                put(date2, "2022-01-02");
                put(date3, "2022-01-03");
                put(date4, "2022-01-04");
                put(date5, "2022-01-05");
            }};
            int pass_count = 0;
            for (Map.Entry<Date, String> entry : map.entrySet()){
                try {
                    if (solution.date2String(entry.getKey(),format).equals(entry.getValue())){
                        pass_count++;
                    }
                }catch (Exception e) {

                }
            }
            return new int[]{pass_count,map.size()};
        }catch (Exception e){
            return new int[] {0, 5};
        }
    }
}
