package Java_booking_list.Matrik_Math;

import java.util.Scanner;

public class TransportMatrik {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("How many rows Matrik number : ");
        int r = sc.nextInt();
        System.out.println("How many col Matrik number : ");
        int c = sc.nextInt();
        int[][]arry = new int[r][c];
        System.out.println("Enter " + ( r*c ) + " Value");
        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                arry[i][j] = sc.nextInt();
            }
        }

        System.out.print("Array element : \n");
        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                System.out.print("\t " + arry[i][j]);
            }
            System.out.println();
        }

        System.out.print("Transpose Matrik : \n");
        for (int i = 0; i<c; i++){
            for (int j = 0; j<r; j++){
                System.out.print("\t " + arry[j][i]);
            }
            System.out.println();
        }
    }
}
