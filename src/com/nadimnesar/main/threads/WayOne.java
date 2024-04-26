package com.nadimnesar.main.threads;

//Creating Thread using Thread Class

public class WayOne {
    public static void main(String[] args) {
        var startTime = System.currentTimeMillis();
        ThreadUsingThreadClass thread1 = new ThreadUsingThreadClass();
        ThreadUsingThreadClass thread2 = new ThreadUsingThreadClass();

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // This ensures the main thread waits until thread 1 and 2 finishes.
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        var endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
    }
}

class ThreadUsingThreadClass extends Thread {

    @Override
    public void run(){
        System.out.println("Started Thread");
        printNumbers();
    }

    public void printNumbers(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        for(int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}