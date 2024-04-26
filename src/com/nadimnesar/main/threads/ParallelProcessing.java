package com.nadimnesar.main.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ParallelProcessing {
    public static void main(String[] args) {
        RunnableClass runnable = new RunnableClass();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(runnable.getNum());
        System.out.println(runnable.getNum2());
    }
}

class RunnableClass implements Runnable {

    Integer num = 10;
    AtomicInteger num2 = new AtomicInteger(10);

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            incrementer();
            incrementer2();
            incrementer3();
        }
    }

    synchronized public void incrementer() {
        num++;
    }

    public void incrementer2() {
        synchronized (this){
            num++;
        }
    }
    public void incrementer3() {
        num2.incrementAndGet();
    }

    public Integer getNum() {
        return num;
    }

    public Integer getNum2() {
        return num2.get();
    }

}