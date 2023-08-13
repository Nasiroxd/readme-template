package com.nasiruddin.batchnumber1;

import java.time.LocalDateTime;

public class MyThread  extends  Thread{

   private final String threadName;

    public  MyThread(String threadName){
        this.threadName = threadName;

    }
    @Override
    public void run(){
        for (int i = 0; i<5; i++){
            System.out.println(threadName + " " +i + "Time : "+ LocalDateTime.now());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
