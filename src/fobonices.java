import java.util.Scanner;

public class fobonices {
   
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int num;
        System.out.println("Enter the fobonic number : ");
        num = sc.nextInt();

        int first = 0;
        int second = 1;
        int fibo;

        System.out.println(first + " " + second);

        for(int i = 3; i<=num; i++){

            fibo = first + second;
            System.out.println("fobonic number  : " + fibo);
            first = second;
            second = fibo;


           
            

        }

        



     
    }

    
}
