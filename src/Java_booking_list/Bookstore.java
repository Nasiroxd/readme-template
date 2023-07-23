package Java_booking_list;

import java.util.Scanner;

public class Bookstore {

    static Scanner input = new Scanner(System.in);

    static String book[] = {"JAVA", "PYTHON", "HTML"};
    static final double studentDiscount = 0.2;
    static final double teacherDiscount = 0.4;
    static final double aligonDiscount = 0.3;

    public static void main(String[] args) {
        System.out.println("your book store...................welcome to ....");
        System.out.println("Your book store  : \nAns");
        String userinput = input.nextLine();

        if (book[0].toLowerCase().equals(userinput.toLowerCase())) {
            System.out.println("YOU OPSTED "+book[0] + " Book");
            calcultorArea(book[0]);
            
        }else if (book[1].toLowerCase().equals(userinput.toLowerCase())) {
            System.out.println("YOU OPSTED "+ book[1] + " Book");
            calcultorArea(book[1]);
            
        }else if (book[2].toLowerCase().equals(userinput.toLowerCase())) {
            System.out.println("YOU OPSTED "+book[2] + "Book");
            calcultorArea(book[2]);
            
        }else{
            System.out.println("Sorry!!! we are not book");
        }
        
    }

    static void calcultorArea(String bookName){
        System.out.println("Are your student , teacher , aligon  : \nAns ");
        String answer = input.nextLine();

        double price = 200;

        if (answer.toLowerCase().equals("teacher")) {
            price = price-(price*teacherDiscount);
            showPrice(price);

            
        }else  if (answer.toLowerCase().equals("student")) {
            price = price-(price*studentDiscount);
            showPrice(price);
            
            
        }else  if (answer.toLowerCase().equals("aligon")) {
            price = price-(price*aligonDiscount);
            showPrice(price);
            
            
        }else{
            System.out.println("Sorry ,, we can`t not serve you!!");
        }


    }

    static void showPrice(double price){
        System.out.println("Your total payable Amount : "+ price);
        System.out.println(".................thanks you price ........... welcome that");
    }

  
       


    
}
