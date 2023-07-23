package Java_booking_list;



public class Dog {

    public static void main(String[] args) {
        prattan2(4);


    }


    static void prattan1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(" " + col);
            }

            System.out.println();
        }
    }

    static void prattan2(int n){
        for(int row = 1; row <= 2*n; row++){
            for(int col = 1; col <= n*row-1; col++){
                int numberOfRows = 456;
                System.out.print(" " + numberOfRows);
            }

            System.out.println();
        }
    }

   
     
}
