package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evaluation64 extends AbstractBaseEvaluation {


    public Evaluation64(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        List<String> listFormat = new ArrayList<>();
        listFormat.add("yyyy-MM-dd HH:mm:ss");
        listFormat.add("EEE, MMM d, ''yy");
        listFormat.add("yyyy.MM.dd G 'at' HH:mm:ss z");
        listFormat.add("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        listFormat.add("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        listFormat.add("yyMMddHHmmssZ");
        listFormat.add("yyyyy.MMMMM.dd GGG hh:mm aaa");

        int pass_count = 0;
        int total_count = 0;
        try{
            total_count = listFormat.size();
            for (String sFormat: listFormat) {
                SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
                if(solution.getStringToday(sFormat).length() == (sdf.format(new Date()).length())){
                    pass_count++;
                }
            }

        }catch (Exception e){

        }
        try {
            total_count++;
            if (solution.getStringToday("").equals("")) {
                pass_count++;
            }
        }catch (Exception e){
        }

        try{
            total_count++;
            if(solution.getStringToday(null).equals("")){
                pass_count++;
            }
        }catch (Exception e){
        }
        return new int[]{pass_count, total_count};
    }
}
