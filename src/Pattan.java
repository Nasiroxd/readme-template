import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattan {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);

       Matcher matcher = pattern.matcher("visit   W3Schools");

       boolean matchfound = matcher.find();

       if(matchfound){
        System.out.println("match found");
       }else{
        System.out.println("match not found");
       }


       int n, r;
       int sum = 0;
      

       System.out.println("Enter the number : ");
      n = scanner.nextInt();

      

      while (n!=0) {
        r = n%10;
        sum = sum*10+r;
      
        n =  n/10;

        
      }
      
      System.out.print(sum);
     

     
        
        
    }
    
}
