package com.nadimnesar.main.threads;

import java.util.concurrent.*;

public class MultiThreading {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        UserInfo userInfo = new UserInfo();
        UserInfo userInfo2 = new UserInfo();
        UserInfo userInfo3 = new UserInfo();

        Future<String> fString = executorService.submit(userInfo);
        Future<String> fString2 = executorService.submit(userInfo2);
        Future<String> fString3 = executorService.submit(userInfo3);

        try {
            System.out.println(fString.get());
            System.out.println(fString2.get());
            System.out.println(fString3.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }

        executorService.shutdown();
    }
}


class UserInfo implements Callable <String> {  //if no return need use runnable
    @Override
    public String call() throws Exception {
        work();
        return "Nesar Ahmed";
    }

    private void work(){
        for(int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}