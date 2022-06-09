package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;

public class Evaluation147 extends AbstractBaseEvaluation {
    public Evaluation147(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        Map<String, FutureTask> mTest = new HashMap<>();
        mTest.put("pid01", new FutureTask<>(() -> {
            return "pid01";
        }));
        mTest.put("pid02", new FutureTask<>(() -> {
            return "pid02";
        }));
        mTest.put("pid03", new FutureTask<>(() -> {
            return "pid03";
        }));
        mTest.put("pid04", new FutureTask<>(() -> {
            return "pid04";
        }));
        mTest.put("pid05", new FutureTask<>(() -> {
            return "pid05";
        }));

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<String, FutureTask> arrBB : mTest.entrySet()) {
            String ExpectValue = arrBB.getKey();
            String returnPid = null;
            FutureTask ft = arrBB.getValue();
            ft.run();
            try {
                total_count++;
                returnPid = solution.getPid(ft);
                if (returnPid.equals(ExpectValue)) {
                    pass_count++;
                }else {
                    System.out.println("Fail: " + returnPid + " != " + ExpectValue);
                }
            }
            catch (Exception e) {
//                e.printStackTrace();
            }
        }

        try {
            total_count++;
            String pid = solution.getPid(null);
            if (pid == null) {
                pass_count++;
            }
        }
        catch (Exception e) {
//            e.printStackTrace();
        }

        return new int[]{pass_count, total_count};
    }
}
