package com.tyr.spring.tutorial.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;

public class MainConcurrency {

    private static final Logger log = LoggerFactory.getLogger(MainConcurrency.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        myCompletableFuture.asyncPrint().get();
        log.info("END SYNC");

    }
}
