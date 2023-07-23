import java.util.Scanner;

public class Math {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // input 10,20,30....... > 30

        int a = 10, b  = 20, c = 30;

        if(a>b){
            if (a>c) 
                System.out.println(a);
                else
                System.out.println(c);

                
                
            

        }else{
            if (b>c) 
                System.out.println(b);
                else
                System.out.println(c);

                

        }

        
        int m[]=new int [5];
        int sum=0;

        System.out.println("Enter the hight number : ");
        // m = sc.nextInt();
        // n = sc.nextInt();
        // o = sc.nextInt();
        // p = sc.nextInt();
        // q = sc.nextInt();

        for(int i = 0; i< 5; i++){
            m[i] = sc.nextInt();
        }

  
        for(int i = 0; i< 5; i++){
            sum = sum+m[i];
            
        }
       
    //    int sum =m+n+o+p+q;

       System.out.println("sum  :  "+ sum);


     



       int n,p,result = 1;

       System.out.println("Enter  No : ");
       n = sc.nextInt();

       System.out.println("Enter the power : ");
       p = sc.nextInt();


       for(int i = 1; i<=p; i++){
       


        result = n*result;


       }

       System.out.println("result " + result);



       int o, r;
       sum = 0;

       System.out.println("Enter the number : ");
       o = sc.nextInt();

       while (o >0) {
        r = o%10;
        sum = sum+r;
        o = o/10;
        
       }

       System.out.println("sum : "+sum);



       int  num1, num2;

       System.out.println("Enter the 2 number : ");
       num1 = sc.nextInt();
       num2 = sc.nextInt();

        sum = num1* num2;
        System.out.println("sum : "+sum);


    }

    
    
}
