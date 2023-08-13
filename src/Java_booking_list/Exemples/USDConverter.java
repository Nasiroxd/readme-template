package Java_booking_list.Exemples;

import java.util.Scanner;

public class USDConverter {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double BDT;
        double USD =0;

        System.out.println("Enter the USD : ");
        USD = sc.nextInt();

        // Bdt = 80;
        BDT = USD*0.0092;


        System.out.println("The BDT " + USD + " BDT Convert TK " + BDT);

    }
}
