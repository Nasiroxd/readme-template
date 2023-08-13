package com.nasiruddin.batchnumber1;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoApp {
    public static void main(String[] args) {

        Date n = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd/mmm/yyy");
        String currentDate = String.valueOf(n.getMonth()+1);
        System.out.println("Current Date : "+ currentDate);

//        System.out.println( n.getMonth());
        System.out.println(n.getYear());
        System.out.println(n);
//        System.out.println(n.getDate());



    }
}
