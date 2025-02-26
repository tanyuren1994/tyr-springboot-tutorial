package com.tyr.spring.tutorial.concurrency;

import lombok.Getter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class PowerThread {

    public static void main(String[] args) throws InterruptedException {
        BigInteger result = calculateResult(BigInteger.ONE,BigInteger.ONE,BigInteger.ONE,BigInteger.ONE);
    }

    public static BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) throws InterruptedException {
        BigInteger result = BigInteger.ZERO;
    /*
        Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
        Where each calculation in (..) is calculated on a different thread
    */
        List<Thread> threadList = new ArrayList<>();
        threadList.add(new PowerCalculatingThread(base1,power1));
        threadList.add(new PowerCalculatingThread(base2,power2));

        for (Thread thread:threadList) {
            thread.start();
        }

        for (Thread thread:threadList) {
            thread.join();
        }


        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        @Getter
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
       /*
       Implement the calculation of result = base ^ power
       */

            System.out.println("testing");
        }

    }

}
