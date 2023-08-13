package Java_booking_list.ThreadNumber;

public class CurrentThread extends Thread{

   private String threadName;
   private String color;

  private   int statePointer;

  private int count;
  private int adder;
//  private ThreadClass dependentThread;
  private boolean threadFlagAlive;

    public CurrentThread(String threadName, String color, int statePointer,int adder, boolean threadFlagAlive) {
        this.threadName = threadName;
        this.color = color;
        this.statePointer = statePointer;
        this.adder = adder;
        this.threadFlagAlive = threadFlagAlive;

//        this.dependentThread = dependentThread;


    }



    @Override
    public void run() {
        count = statePointer;

//        if (dependentThread!=null){
//            dependentThread.join();
//        }

        while (threadFlagAlive) {
            count += adder;

            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public void stopThread(){
        threadFlagAlive = false;
    }

    public boolean isThreadFlagAlive() {
        return threadFlagAlive;
    }

    public void setThreadFlagAlive(boolean threadFlagAlive) {
        this.threadFlagAlive = threadFlagAlive;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStatePointer() {
        return statePointer;
    }

    public void setStatePointer(int statePointer) {
        this.statePointer = statePointer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAdder() {
        return adder;
    }

    public void setAdder(int adder) {
        this.adder = adder;
    }
}
