package com.company;

import com.company.threads.Counting;
import com.company.threads.Delay;
import com.company.threads.Gulag;
import java.io.IOException;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("xxx");

        ExecutorService pool = Executors.newFixedThreadPool(5);



        Future<Integer> result = pool.submit(new Delay());
        pool.submit(new Counting());

        try {
            result.get();
            pool.shutdownNow();
        } catch (Exception e) {

        }

        ExecutorService gulag = Executors.newSingleThreadExecutor();
        Future<Integer> gulagFuture = gulag.submit(new Gulag(10));

        try {

        } catch (Exception e) {

        }

        System.out.println("x");
    }
}
