package Java_booking_list.Matrik_Math;

import java.util.Scanner;

public class ATM {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int balance = 20000, withdrew,deposoite,exit,num;

        while(true){
            System.out.println("Welcome to our ATM Machine");
             System.out.println("1. wihdrew");
              System.out.println("2.Deposoite");
               System.out.println("3.check balance");
                System.out.println("4.exit");
                num = sc.nextInt();

                switch (num) {
                    case 1:
                     System.out.println("Enter amoubt to withdrew");
                     withdrew = sc.nextInt();
                     if (balance >= withdrew) {
                        balance = balance-withdrew;

                        System.out.println("Balance Amount is : " + balance);
                        System.out.println("please collect money");
                        
                     }else{
                        System.out.println("You dont enough mony for withdrew");
                     }
                     System.out.println(" ");
                     break;
                     case 2:
                     System.out.println("Enter Amount is : ");
                     deposoite = sc.nextInt();
                     balance = balance+deposoite;
                     System.out.println("deposite AMOUNT IS " +balance);
                     System.out.println("deposite Amount is succesfully ");
                     System.out.println(" ");
                     break;
                     case 3:
                     System.out.println("Blance of your account is " + balance);
                     System.out.println(" ");
                     break;
                     case 4:
                     System.exit(0);
                     System.out.println(" ");

                        
                  
                
                   
                }
            
        }


    }
    
}
