package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class GenerateMethod147 extends GenerateMethodBase {
    /**
     *  Returns the pid of the task
     */
    @Override
    public String getPid(FutureTask t) {
        try {
            return t.get().toString();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return "";
    }
}
