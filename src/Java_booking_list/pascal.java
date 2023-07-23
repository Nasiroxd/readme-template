package Java_booking_list;

import java.util.Scanner;

public class pascal {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("give the exits number ");
        System.out.print("Enter the pascal number : ");
       int userinput = input.nextInt();

        while (userinput!=-1) {
            if (userinput<-1 || userinput>20) {
                System.out.println("Enter the pascal number 1-20?\nAns");
               userinput = input.nextInt();
               continue;
                
            }

            pascalArea(userinput);
            System.out.println("\n\n");
            System.out.println("Enter the pascal number 1-20?\nAns");
            userinput = input.nextInt();

           
        }
      
}

static void pascalArea(int length){
    int [][] pascal = new int[length][length];
    for(int i = 0; i<length; i++){
        pascal[0][i] = 1;
        pascal[i][0] = 1;
    }
    

    for(int row = 1; row< length; row++){
        for(int col = 1; col< length-row; col++){
            pascal[row][col] = pascal[row][col-1]+pascal[row-1][col];
        }
        
    }

    for(int row = 0; row< length; row++){
        for(int col = 0; col< length-row; col++){
           System.out.print(pascal[row][col] + "\t");
          
        }
        System.out.println("\n");
    }
}







}
