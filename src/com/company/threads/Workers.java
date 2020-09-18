package com.company.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Workers implements Callable {
    int hours = 0;

    private static int ids = 1;
    public int id = 0;

    public Workers() {
        id = ids;
        ids += 1;
    }

    @Override
    public Integer call() throws Exception {

        for(int i = 0; i < Integer.MAX_VALUE; ++i) {
            TimeUnit.MILLISECONDS.sleep((long)(id * 3.14) * 1000 + 1000);


            System.out.println("Miner: " + id + ", Mined ore");
        }

        return 1;
    }
}
