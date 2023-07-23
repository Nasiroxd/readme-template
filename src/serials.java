import java.util.Scanner;


public class serials {

    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        int n, sum=0;

        System.out.println("Enter the number  : ");
        n = sc.nextInt();

        for(int i =1; i<=n; i++){
            System.out.print(i + "  ");
            sum = sum+i;
        }
        System.out.println(sum);

       
    }
    
}
