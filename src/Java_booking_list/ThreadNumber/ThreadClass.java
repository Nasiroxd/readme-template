package Java_booking_list.ThreadNumber;

import java.util.Scanner;

public class ThreadClass{
    static Scanner sc = new Scanner(System.in);
   private static CurrentThread thread1 = new CurrentThread("Child 1","Green",6,01,true);
  private static   CurrentThread thread2 = new CurrentThread("Child 2","Red",2,02,true);
  private static   CurrentThread thread3 = new CurrentThread("Child 3","Yellow",3,03,true);
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread");

        t.getName();
        System.out.println("After name change : " + t);

        for (int i=10; i >= 0; i--){
            System.out.println("Current thread " + i);
            Thread.sleep(500);
        }
//        new ThreadClass("nasir", 21);
        System.out.println("Main thread interaction");


        thread1.start();
        thread2.start();
        thread3.start();




    System.out.println("Enter the number of thread : ");
    String output = sc.nextLine();

    while (!output.toLowerCase().equals("exit")){
        if (output.equals("1")){
            System.out.println("Counter is thread 1 : " +thread1.getCount() );
            threadAlive();


        }else if (output.equals("2")){
            System.out.println("Counter is thread 2 : " +thread2.getCount() );
            threadAlive();

        }else if (output.equals("3")){
            System.out.println("Counter is thread 3 : " +thread3.getCount() );
            threadAlive();

        }else if (output.equals("1s")){
            thread1.stopThread();
            System.out.println( "Thread 1 stopped");
            threadAlive();
        }else if (output.equals("2s")){
            thread2.stopThread();
            System.out.println("Thread 2 stopped" );
            threadAlive();
        }else if (output.equals("3s")){
            thread3.stopThread();
            System.out.println("Thread 3 stopped" );
            threadAlive();
        }
        else {
            System.out.println("please give a proper command");
        }
        output = sc.nextLine();
    }



//        System.out.println(currentThread.getColor());
//        System.out.println(currentThread.getAge());





    }

    private static void threadAlive(){
        System.out.println("thread 1 is Alive " +thread1.isAlive() );
        System.out.println("thread 1 is Alive " +thread2.isAlive() );
        System.out.println("thread 1 is Alive " +thread3.isAlive() );

    }

    public void join() {
    }
}
