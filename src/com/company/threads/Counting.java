package com.company.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Counting implements Callable {
    @Override
    public Integer call() throws Exception {
        for (double i = 0; i < Double.MAX_VALUE; ++i) {
            TimeUnit.MILLISECONDS.sleep(800);
            System.out.println("Loading...");
        }
        return 1;
    }
}
