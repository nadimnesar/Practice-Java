package com.nadimnesar.main.threads;

/*
Runnable
- Those who implement runnable, can be run.
Thread
- It implement runnable, so it can be run.
- It have own start method to run the runnable.
 */

//This is an appropriate way to create thread.

public class WayTwo {
    public static void main(String[] args) {
        ThreadUsingRunnableInterface runnable = new ThreadUsingRunnableInterface(); // this is a runnable but its have no start method
        Thread thread1 = new Thread(runnable); //making thread using runnable to start

        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(thread1.getState());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(thread1.getState());

    }
}

class ThreadUsingRunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Started Thread");
        printNumbers();
    }

    public void printNumbers(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        for(int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}