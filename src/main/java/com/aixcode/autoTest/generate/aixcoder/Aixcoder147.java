package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class Aixcoder147 extends GenerateMethodBase {
    /**
     *  Returns the pid of the task
     */
    @Override
    public String getPid(FutureTask t) throws ExecutionException, InterruptedException {
        if (t != null) {
            Object o = t.get(); // original code is "t.result", which is unknown.

            if (o != null) {
                return o.toString();
            }
        }

        return null;
    }
}
