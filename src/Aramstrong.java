import java.util.Scanner;

public class Aramstrong {

    static Scanner r = new Scanner(System.in);

    public static void main(String[] args) {
        int n, arm=0, rem, c;

        System.out.println("Enter the number : ");
        n = r.nextInt();
        c = n;
       

        for(int i = 1; i<5; i++){
           
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n = n/10;
           
           
           

        }
        // while (n >0) {
        //     rem = n%10;
        //     arm = (rem*rem*rem)+arm;
        //     n = n/10;
            
        // }
        if(c==arm){
          
            System.out.println("Aramstrong number ");
            
        }else{
         
            System.out.println("not a Aramstrong number");
        }

     
        n = r.nextInt();
    }

      
    
}
