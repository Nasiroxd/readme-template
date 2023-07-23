package Java_booking_list.Matrik_Math;

import java.util.Scanner;

public class matrik3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][]a = new int[2][3];
        int[][]b = new int[2][3];
         
        

        // a[0][0] = 2;
        // a[0][1] = 5;
        // a[0][2] = 3;
        // // a[1][0] = 5;
        // // a[1][1] = 7;
        // // a[1][2] = 2;

        // // b[0][0] = 2;
        // // b[0][1] = 4;
        // // b[0][2] = 3;
        // b[1][0] = 4;
        // b[1][1] = 7;
        // b[1][2] = 2;

        
       


         System.out.println("Enter the element matrik :  ");
          

        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                a[i][j] = sc.nextInt();
                
                  
            }
              System.out.println(" ");
          
        }

           System.out.println("A  =  ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print("\t " + (a[i][j]));
            }
              System.out.println(" ");
          
        }

         System.out.println("Enter the element matrik :  ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.printf("B[%d][%d] = ", i,j);
                b[i][j] = sc.nextInt();
            }
              System.out.println(" ");
          
        }

     

         System.out.println("B =  ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print("\t " + b[i][j]);
            }
              System.out.println(" ");
          
        }

          System.out.println("A+B =  ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print("\t " + (a[i][j] +b[i][j]));
            }
              System.out.println(" ");
          
        }
    }
    
}
