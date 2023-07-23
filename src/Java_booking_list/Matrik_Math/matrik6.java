package Java_booking_list.Matrik_Math;

import java.util.Scanner;

public class matrik6 {
     static  Scanner sc = new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Enter how many rows");
        int r = sc.nextInt();
         System.out.println("Enter how many columns");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int sumOfDiagonal = 0;
        System.out.println("Enter " + (r*c)+ " Value:");


        
               
    

           for(int row = 0; row< r; row++){
            for(int col = 0; col< c; col++){
                System.out.print("A["+row+"]["+col+"] :  ");
                a[row][col] = sc.nextInt();
            }
        }

        System.out.println("Array Matrik : ");
         for(int row = 0; row< r; row++){
            for(int col = 0; col< c; col++){
                System.out.print("\t" + a[row][col]);

               
            }
            System.out.println("\n");
        }
         System.out.println("Tranpose  Matrik : ");
         for(int row = 0; row< c; row++){
            for(int col = 0; col< r; col++){
                System.out.print("\t" + a[col][row]);

                if(row==col){
                    sumOfDiagonal = sumOfDiagonal+a[row][col];
                }

               
            }
           
            System.out.println("");
        }
         System.out.println("sumOfDiagonal number matrik = " + sumOfDiagonal);

         int num;
         System.out.println("Enter the number of 1 and 10 : ");
          num = sc.nextInt();

        

          for(int i = 1; i<=10; i++){
             System.out.println(num + " x "+ i + " = "+ num*i);
            
         }

    }
    
}
