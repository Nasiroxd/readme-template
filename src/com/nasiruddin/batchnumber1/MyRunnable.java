package com.nasiruddin.batchnumber1;

import java.time.LocalDateTime;

public class MyRunnable implements Runnable{

//   private final String   currentThreadName;
//
//    public MyRunnable(String  currentThreadName){
//        this.currentThreadName = currentThreadName;
//
//    }

    private String names;
    private int age;

    private String color;
    private  int adder;
    private int counter;

    public MyRunnable(String names, int age,String color, int adder) {
        super();
        this.names = names;
        this.age = age;
        this.color = color;
        this.adder= adder;

    }

    @Override
    public void run(){
        counter+=adder;

        while (!Thread.currentThread().isInterrupted()){
            counter++;
            try {
                System.out.println(counter);
                Thread.sleep(500);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                break;
            }
        }





    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAdder() {
        return adder;
    }

    public void setCgpa(int adder) {
        this.adder = adder;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
