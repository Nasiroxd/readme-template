package com.nasiruddin.batchnumber1;

public class AThreadClass extends Thread{
    @Override
    public void run() {
        String currentThread = "Insides thread A ";
        for (int i = 1; i<= 5; i = i+2){
            System.out.println(currentThread +  i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exit thread B");
    }
}
