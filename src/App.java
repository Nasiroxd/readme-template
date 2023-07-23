import java.util.Scanner;

public class App {

   static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Thread is started!");
        myTrap thread1 = new myTrap(31, "Ressalo ", true);
      myTrap thread2 = new myTrap(30, "Ress ", true);
   myTrap thread3 = new myTrap(20, "Ressa ", true);

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.print("Enter the name n : ");
        String commandString = myScanner.nextLine();

        while (!commandString.toLowerCase().equals("exit")) {
            if(commandString.equals("1")){
                System.out.println("counter Thread 1 : " +thread1.getCounter());
            }else if(commandString.equals("2")){
                System.out.println("counter Thread 2 : " +thread2.getCounter());
            }
           else if(commandString.equals("3")){
                System.out.println("counter Thread 3 : " +thread3.getCounter());
            }
            
            commandString = myScanner.nextLine();
        }
        
        


        Thread thread4 = new myTrap();
        Thread thread5 = new myTrap();

        thread4.start();
        thread5.start();

    }

  
}

class myTrap extends Thread{

  
  private String namestring;
  private int amountNumber;
  private int counter;

   private boolean threadName;

   

   


public myTrap(int amountNumber, String namestring,  boolean threadName) {
    this.amountNumber = amountNumber;
    this.namestring = namestring;
    // this.counter = counter;
  
    this.threadName = threadName;
}

@Override
public void run(){

    counter=amountNumber;

    while (threadName) {
        counter+=amountNumber;
        
    }
    for ( int i = 0; i<10;i++){
        System.out.println("[" + Thread.currentThread().getName() + "]" + i);
        

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

public void stoprun(){
    threadName= false;
}


public String getNamestring() {
    return namestring;
}

public void setNamestring(String namestring) {
    this.namestring = namestring;
}

public int getAmountNumber() {
    return amountNumber;
}

public void setAmountNumber(int amountNumber) {
    this.amountNumber = amountNumber;
}

public int getCounter() {
    return counter;
}

public void setCounter(int counter) {
    this.counter = counter;
}

public boolean isThreadName() {
    return threadName;
}

public void setThreadName(boolean threadName) {
    this.threadName = threadName;
}

public myTrap(){

}

   

   
   
    

}


