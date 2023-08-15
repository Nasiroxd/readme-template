package com.nasiruddin.batchnumber1;

import java.time.LocalDateTime;

public class MultiThreading {
    public void Printer(){
        System.out.println("Printer thread ");
        for (int i = 0; i<5; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("listen server items " + Thread.currentThread());

//        MyThread t1 = new MyThread(" Thread 1 ");
//        MyThread t2 = new MyThread(" Thread 2 ");
//        t1.start();
//        t2.start();

//        AThreadClass a = new AThreadClass();
//        a.start();
//        MyRunnable myRunnable = new MyRunnable("Mini",06,);

//        MyRunnable myRunnable = new MyRunnable();
//
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " executing Runnable 2");
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//        };
//
//        Runnable rLambda = () ->{
//            System.out.println(Thread.currentThread().getName() + " executing Runnable Lambda ");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        };
//
//        Thread t4 = new Thread(rLambda, "thread 4");
//        t4.start();
//        Thread t3 = new Thread(r1, "thread 3");
//        t3.start();
//        Thread t1 = new Thread(myRunnable);
//        t1.setName("thread 1 ");
//        t1.start();
//        Thread t2 = new Thread(myRunnable);
//        t2.setName("thread 2 ");
//        t2.start();




//        Thread t1 = new Thread(){
//            @Override
//            public void run() {
//                final String threadName = "Thread 1";
//                for (int i = 0; i<5; i++){
//                    System.out.println(threadName + " " +i + "Time : "+ LocalDateTime.now());
//
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        };
//        t1.start();
//
//        Thread t2 = new Thread(){
//            @Override
//            public void run() {
//                final String threadName = "Thread 2";
//                for (int i = 0; i<5; i++){
//                    System.out.println(threadName + " " +i + "Time : "+ LocalDateTime.now());
//
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
//        };
//        t2.start();




    }
}
