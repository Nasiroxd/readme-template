package Java_booking_list;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Scanner;

public class Dems {
    static Scanner input = new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] scroe ={80,50,30,20,10,5};
        int dx = 0;

        while (dx < scroe.length) {
          for(int i = dx+1; i<scroe.length; i++){
                   if (scroe[dx] > scroe[i]) {
                       int temp = scroe[dx];
                       scroe[dx] = scroe[i];
                       scroe[i] = temp;
                       
                   }
          }
                   

          dx += 1;
           
        }

        for(int x = 0; x<scroe.length; x++){
            System.out.println(scroe[x]);

        }
        for(int e: scroe){
            System.out.println(e);
        }


        
        
        
        // String[]  arr = {"F", "C", "B", "E", "D","A"};

        String arr[] = new String[5];

        // Arrays.sort(arr);

        // for(int m = 0; m< 6; m++){
        //     System.out.println(arr[m]);
        // }

        System.out.println("Enter the sort names : ");
        for(int i = 0; i<5; i++){
            arr[i] = input.nextLine();
        }
     

        for(int i = 0; i< 5; i++){
            for(int j = i+1; j<5; j++){
                if (arr[i].compareTo(arr[j])>0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }

        for(int x = 0; x<5; x++){
            System.out.print(arr[x] + "\t");

        }
        System.out.println("\n");


        int[] inputArry = new int[5];

        int length = inputArry.length;

        System.out.println("Enter the vale Array : ");
        for(int i  = 0 ; i<length; i++){
            inputArry[i] = input.nextInt();

        }


        System.out.println("unsorted Array : ");
        for(int i = 0; i<length; i++){
            System.out.print(inputArry[i]+" ");

        }

        for(int i = 0; i< length; i++){
            for(int j = 1; j<length-i; j++){
                if (inputArry[j-1] > inputArry[j]) {
                    int temp = inputArry[j];
                    inputArry[j] = inputArry[j-1];
                    inputArry[j-1] = temp;
                    
                }
            }

           
        }
        System.out.println();
        System.out.print("sorted Array : ");
        for(int x = 0; x<length; x++){
            System.out.println(inputArry[x]);
        }


        int [] a = new int[5];
        int count = 0;

        System.out.println("Enter the array element : ");
        for(int i = 0; i<a.length; i++){
            a[i] = input.nextInt();
        }
        System.out.print("Array element : ");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("Enter the search element : ");
        int n = input.nextInt();
        for(int i = 0; i<a.length; i++){
            if (a[i]==n) {
                count++;
                
            }
        }
        if (count >0) {
            System.out.println("Item Found "+ count + "times");
            
        }else{
            System.out.println("Item not found");
        }


        String[] names = {"nasir", "sagor", "janal","anis"};

        for(int i = 0; i<names.length; i++){
            for(int j = i+1; j<names.length; j++){
                if (names[i].compareTo(names[j])>0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    
                }
            }
        }
        for(String s : names){
            System.out.print(s + "\t ");
        }


        int[] a1 = new int[]{1,2,2,3,3,4,5};

        for(int i = 0; i<a.length; i++){
            System.out.println(a1[i] + "\t");
        }

        for(int i =0; i<a1.length; i++){
            for(int j= i+1; j<a1.length; j++) {
                if (a1[i] == a1[j]) {
                    a1[i] = -1;
                    
                } 

            }
        }

        System.out.println("Rove array is  : ");
        for(int i = 0; i<a1.length; i++){
            if (a1[i]!=-1) {
                System.out.println("\t" + a1[i]);
                
            }
        }


       

        char str[] = "nasir, nasir , sagor,jamal".toCharArray();
        int S = str.length;

        System.out.println("Dupcaliate " + removeDupcicate(str, S));
         
       
       
       
        }
        static String removeDupcicate(char str[], int S){

            int index = 0;

            for(int i = 0; i<S; i++){
                int j;
                for( j = 0; j<i; j++){
                    if (str[i] == str[j]) {
                        break;
                        
                    }

                }
               if (j == i) {
                str[index++] = str[i];

                
               }
            }

            return String.valueOf(Arrays.copyOf(str, index));


            


        }

       
        
}  


