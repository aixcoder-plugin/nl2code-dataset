package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder258;
import com.aixcode.autoTest.version1.copilot.Copilot258;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check258 extends BaseAbstractTest {
    List<Object> values = new ArrayList<>(Arrays.asList(
            new Object[]{21, 5, 2, -1, 1},
            "new Object[]{0}",
            12,
            false,
            new Check106()
    ));
    List<Object> values2 = new ArrayList<>(Arrays.asList(
            new Object[]{21, 5, 2, -1, 1},
            "new Object[]",
            15,
            false,
            new Check106()
    ));
    List<Boolean> values3 = new ArrayList<>(Arrays.asList(
            true,
            false,
            false,
            true,
            true
    ));
    @Override
    public int[] checkCopilot() {
        Copilot258 solution=new Copilot258();
        int passCount=0;
        for (int i=0;i<values.size();i++){
            Object value=values.get(i);
            Object value2=values2.get(i);
            Boolean value3=values3.get(i);
            try {
                if (solution.equals(value,value2)==value3){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,values.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder258 solution=new Aixcoder258();
        int passCount=0;
        for (int i=0;i<values.size();i++){
            Object value=values.get(i);
            Object value2=values2.get(i);
            Boolean value3=values3.get(i);
            try {
                if (solution.equals(value,value2)==value3){
                    passCount++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,values.size()};
    }
}
