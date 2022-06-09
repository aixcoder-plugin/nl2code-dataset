package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder397;
import com.aixcode.autoTest.version1.copilot.Copilot397;

public class Check397 extends BaseAbstractTest {
    @Override
    public int[] checkCopilot() {
        Copilot397 solution=new Copilot397();
        int[][] dataSource = new int[7][10];
        dataSource[0] = new int[]{10, 1, 10};
        dataSource[1] = new int[]{10, 10, 1};
        dataSource[2] = new int[]{10, 0, 1};
        dataSource[3] = new int[]{0, -1, 0};
        dataSource[4] = new int[]{-1, 0, 0};
        dataSource[5] = new int[]{2, 3, 0};
        dataSource[6] = new int[]{3, 2, 3};
        int pass_count = 0;
        int total_count = dataSource.length;

        for (int[] rowTest : dataSource) {
            try {
                int result = solution.combinatorial(rowTest[0], rowTest[1]);
                if(result == rowTest[2]) {
                    pass_count++;
                }else {
                    System.out.println("input " +rowTest[0] + "," + rowTest[1]+" Expected: " + rowTest[2] + " Actual: " + result);
                }
            }catch (Exception e) {

            }
        }

        return new int[]{pass_count,total_count};
    }

    @Override
    public int[] checkAixcoder() {
        Aixcoder397 solution=new Aixcoder397();
        int[][] dataSource = new int[7][10];
        dataSource[0] = new int[]{10, 1, 10};
        dataSource[1] = new int[]{10, 10, 1};
        dataSource[2] = new int[]{10, 0, 1};
        dataSource[3] = new int[]{0, -1, 0};
        dataSource[4] = new int[]{-1, 0, 0};
        dataSource[5] = new int[]{2, 3, 3};
        dataSource[6] = new int[]{3, 2, 3};
        int pass_count = 0;
        int total_count = dataSource.length;

        for (int[] rowTest : dataSource) {
            try {
                int result = solution.combinatorial(rowTest[0], rowTest[1]);
                if(result == rowTest[2]) {
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }

        return new int[]{pass_count,total_count};
    }
}
