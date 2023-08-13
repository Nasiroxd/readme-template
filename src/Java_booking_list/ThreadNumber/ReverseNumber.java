package Java_booking_list.ThreadNumber;

import java.util.Scanner;

public class ReverseNumber {
    static Scanner sc = new Scanner(System.in);

//    public static String reverseString(String str){
//
//
//        String[] word = str.split(str);
//        String  result = " ";
//
//
//        for (int i = word.length-1; i>=0; i--){
////            System.out.println("Enter the names : ");
//
//            if (i==0){
//
//                result = result+ word[i];
//            }else {
//                result = result+ word[i]+ " ";
//
//            }
//            String str1 = str;
//            System.out.println("Enter the name");
//            str1 = sc.nextLine();
//
//        }
//
//        return result;
//
//    }


    public static void main(String[] args) {

        System.out.println("Enter the names : ");
        String str = sc.nextLine();

        String[] word = str.split("");
        String result = " ";


        for (int i = word.length - 1; i >= 0; i--) {
//            System.out.println("Enter the names : ");

            if (i == 0) {

                result = result + word[i];
            } else {
                result = result + word[i] + " ";

            }




        }

        System.out.println(result);


    }
        //Bangladesh is the welcome.....





}
