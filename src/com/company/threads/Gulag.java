package com.company.threads;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Gulag implements Callable {

    int workers = 0;

    public Gulag(int workers) {
        this.workers = workers;
    }

    @Override
    public Integer call() throws Exception {
        Scanner scan = new Scanner(System.in);

        ExecutorService workersPool = Executors.newFixedThreadPool(10);

        for(int i = 1; i < workers; ++i) {
            workersPool.submit(new Workers());

        }
        synchronized (this) {
            int h = scan.nextInt();
            System.out.println("xxx" + h);
        }

        return 1;
    }
}
