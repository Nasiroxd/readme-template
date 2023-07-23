package Java_booking_list;

import java.util.Scanner;

public class Calendar {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
         // Calendar number............

         System.out.println("Enter the calendar number : ");
         String month = scan.nextLine();
         int begin = scan.nextInt();
         int dayNum = scan.nextInt();
 
         String header = "S S M T W T F";
         System.out.println(month);
         System.out.print(header);
 
         int day = 1;
         for(int i =1; i<= begin+dayNum -1; i++){
             if(i%7==1){
                 System.out.println();
             }if (i<begin) {
                 System.out.print(" ");
                 
             }else{
                 if (day/10==0) {
                     System.out.print(" " + day);
                     
                 }else{
                     System.out.print("  " + day);
                 }

                 day++;
                 System.out.println("");
         }
         }


        
    }
    
}
