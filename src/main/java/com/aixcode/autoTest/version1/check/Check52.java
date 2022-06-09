package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder52;
import com.aixcode.autoTest.version1.copilot.Copilot52;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.NaN;

public class Check52 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot52 solution = new Copilot52();
        double[] vector ={1,2,3};
        double[] vector1 ={1,2,3,NaN};
        double[] vector2 ={1,2,3,NaN,NaN};
        double[] vector3 ={1,2,3,NaN,NaN,NaN};
        double[] vector4 ={1,2,3,NaN,NaN,NaN,NaN};
        double[] vector5 ={1,2,3,NaN,NaN,NaN,NaN,NaN};
        Map<double[],Boolean> map = new HashMap<double[],Boolean>(){{
            put(vector1,true);
            put(vector2,true);
            put(vector3,true);
            put(vector4,true);
            put(vector5,true);
        }};
        int pass_count = 0;
        int value = solution.hashCode(vector);
        for(Map.Entry<double[],Boolean> entry:map.entrySet()){
            try{
                if ((value == solution.hashCode(entry.getKey())) == entry.getValue()){
                    pass_count ++;
                }
            }catch (Exception e){

            }
        }

        return new int[]{pass_count,map.entrySet().size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder52 solution = new Aixcoder52();
        double[] vector ={1,2,3};
        double[] vector1 ={1,2,3,NaN};
        double[] vector2 ={1,2,3,NaN,NaN};
        double[] vector3 ={1,2,3,NaN,NaN,NaN};
        double[] vector4 ={1,2,3,NaN,NaN,NaN,NaN};
        double[] vector5 ={1,2,3,NaN,NaN,NaN,NaN,NaN};
        Map<double[],Boolean> map = new HashMap<double[],Boolean>(){{
            put(vector1,true);
            put(vector2,true);
            put(vector3,true);
            put(vector4,true);
            put(vector5,true);
        }};
        int pass_count = 0;
        int value = solution.hashCode(vector);
        for(Map.Entry<double[],Boolean> entry:map.entrySet()){
            try{
                if ((value == solution.hashCode(entry.getKey())) == entry.getValue()){
                    pass_count ++;
                }
            }catch (Exception e){

            }
        }

        return new int[]{pass_count,map.entrySet().size()};
    }
}
