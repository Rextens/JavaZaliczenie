package com.company.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Delay implements Callable {
    @Override
    public Integer call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("done");
        return 0;
    }
}
