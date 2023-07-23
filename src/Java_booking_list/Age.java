package Java_booking_list;

import  java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class Age {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws ParseException  {
        System.out.println("Enter the age of Birth (DD-MM -YYYY)");
        String dob = input.next();

        //convert
        SimpleDateFormat s1 = new SimpleDateFormat("dd-mm-yyyy");
        Date  udobsDate = s1.parse(dob);
        try {
              s1.parse(dob);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }

        Date s3 = new Date();

        long ms = System.currentTimeMillis()-udobsDate.getTime();
        long age = (long) ((long)ms/(1000.0*60*60*24*365));
        System.out.println("your current age  = "+ age);



       
        
    }
    
}
