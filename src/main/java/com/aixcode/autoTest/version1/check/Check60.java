package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder60;
import com.aixcode.autoTest.version1.copilot.Copilot60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check60 extends BaseAbstractTest {
    public List<int[]> arrList=new ArrayList<>(3){
        {
            add(new int[]{1,2,3});
            add(new int[3]);
            add(new int[]{7});
            add(new int[]{8,8});
            add(new int[]{5,8,2,5,8,2});
        }
    };
    @Override
    public int[] checkCopilot() {
        Copilot60 solution = new Copilot60();
        int pass_count = 0;
        for(int[] arr:arrList){
            try{
                int[] result = solution.copy(arr);
                if(Arrays.equals(result,(arr))&&result!=arr){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,arrList.size()};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder60 solution = new Aixcoder60();
        int pass_count = 0;
        for(int[] arr:arrList){
            try{
                int[] result = solution.copy(arr);
                if(Arrays.equals(result,(arr))&&result!=arr){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,arrList.size()};
    }
}
