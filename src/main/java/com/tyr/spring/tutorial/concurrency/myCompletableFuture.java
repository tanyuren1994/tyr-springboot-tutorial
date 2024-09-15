package com.tyr.spring.tutorial.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@Slf4j
public class myCompletableFuture {
    private static final Logger log = LoggerFactory.getLogger(myCompletableFuture.class);

    private final static Supplier<String> sumSupplier = () -> {
        try {
            log.info("before sleep");
            Thread.sleep(1000);
            log.info("after sleep");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "HELLO ASYNC";
    };

    public static CompletableFuture<String> asyncPrint() {
        return CompletableFuture.supplyAsync(sumSupplier);
    }
}
