package com.tyr.spring.tutorial.concurrency;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainMultiThread {
    public static void main(String[] args) {
        Thread thread = new MyThread();

        log.info("we are in this thread {}", Thread.currentThread().getName());
        thread.start();
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            log.info("code that's running on the new thread {}", this.getName());
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


}
