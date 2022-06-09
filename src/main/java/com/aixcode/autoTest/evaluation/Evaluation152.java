package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation152 extends AbstractBaseEvaluation {
    public Evaluation152(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        Map<String, String> mTest = new HashMap<>();
        mTest.put("TestDataLess32", "5c1e976bbc1fd8356d394b1b55e358f5");
        mTest.put("TestData_Length_longerThan_32_length", "ab7f12ec93598bcce8695a06c0210ea4");
        mTest.put("", "d41d8cd98f00b204e9800998ecf8427e");
        mTest.put("xor指的是Visual Basic中式一种逻辑运算符。在汇编中也有xor指令。", "1a1462775a239866303e040f3ce598bb");//chinese words
        mTest.put("          ", "41b394758330c83757856aa482c79977");//empty words

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<String, String> arrBB : mTest.entrySet()) {
            String source = arrBB.getKey();
            String result = arrBB.getValue();
            String actualReturn;
            try {
                total_count++;
                actualReturn = solution.toMd5Code(source);
                if (actualReturn.length() == 32){
                    if(actualReturn.equals(result)){
                        pass_count++;
                    }else {
                        System.out.println("TestData: " + source);
                        System.out.println("Expected: " + result);
                        System.out.println("Actual: " + actualReturn);
                    }
                }
            }
            catch (Exception e) {
            }
        }

        try {
            total_count++;
            String actualReturn = solution.toMd5Code(null);
            if (actualReturn == null){
                pass_count++;
            }else {
                if(actualReturn.equals("")){
                    pass_count++;
                }
            }
        }
        catch (Exception e) {
        }

        return new int[]{pass_count, total_count};
    }
}
