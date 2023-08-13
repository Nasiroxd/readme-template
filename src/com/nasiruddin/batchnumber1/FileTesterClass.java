package com.nasiruddin.batchnumber1;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class FileTesterClass {
    public static void main(String[] args) {

//        File fileinp = new File("C:/Users/Nasir Chowdhury/OneDrive/Desktop/student.txt");
//        File fileout = new File("C:/Users/Nasir Chowdhury/OneDrive/Desktop/teacher.txt");

        try {
            Formatter formatter = new Formatter("C:/Users/Nasir Chowdhury/OneDrive/Desktop/student5.txt");
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                String names = scanner.nextLine();
                System.out.println(names);
                formatter.format(" \r \n",names);
            }
            formatter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
