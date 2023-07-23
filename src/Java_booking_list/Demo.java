package Java_booking_list;

import java.util.Scanner;

public class Demo {
    static Scanner input  = new Scanner(System.in);
    public static void main(String[] args) {

        int a = 10;
        String name = "Battles";

        while (a >0){
            if (a==1) {
                name = "Battle";

                
            }else if(a<7){
                System.out.println("handing on the wall pager" + a + name);

            }else{
                System.out.println("show not the battles wall ");
            }

            System.out.println(a + "green" + name + "handing on the wall");
            // System.out.println(a + "green" + name + "handing on the wall");
            System.out.println("And the if the one green bottles accidentally fall");
            a = a-1;
            
        }

        if (a>0) {
            System.out.println("there will be " +a + "green" + name+ "handing on the wall");
            
        }else{
            System.out.println("threw will be no grren , handing on the wall");
        }

        int[][] twoDArray = new int[2][4];

        twoDArray[0][0] = 10;
        twoDArray[0][1] = 20;
        twoDArray[0][2] = 30;
        twoDArray[0][3] = 25;
        twoDArray[1][0] = 40;
        twoDArray[1][1] = 50;
        twoDArray[1][2] = 60;
        twoDArray[1][3] = 35;

        twoDArray[1][2]+=twoDArray[0][2]+twoDArray[0][3];
        System.out.println( "at 2dArray[1][2]  = "+  twoDArray[1][2]);


        System.out.println("Enter the name : ");
        String myName = input.nextLine();

        // System.out.println(("this is short name )" ));
        // System.out.println(myName);
        // System.out.println("this is charater of the my Name  = " + myName.length());
        System.out.println();
        

        if (myName.length() >15) {
            System.out.println("your name is top number");
            
        }else if(myName.length() < 4){
            System.out.println("your name is samall name ");

           
        } else{
            System.out.println("your name is ok");
        }

        switch (myName.length()) {
            case 7:
            System.out.println("your name 7 digit name");

                
                break;
                case 6:
                System.out.println("your name 6 digit name");
    
                    
                    break;
                    case 5:
                    System.out.println("your name 5 digit name");
        
                        
                        break;
        
            default:
            System.out.println("your name is the right slide done");
                break;
        }


        System.out.println("Enter the pascal number : ");

        int[][] twosDArray = new int[2][3];

        for(int row = 0; row<2; row++){
            for( int col = 0; col<3; col++){
                System.out.print("twosDArray ["+row+"]["+col+"] : ");
                twosDArray[row][col] = input.nextInt();

            }
        }

        for(int row = 0; row<2; row++){
            for( int col = 0; col<3; col++){
                twosDArray[row][col] = twosDArray[row][col]+twosDArray[row][col]; 
                System.out.print(twosDArray[row][col] + "\t");

            }
            System.out.println("\n");
        }

        System.out.println("Enter the number : ");
        int userinput = input.nextInt();
        

        while (userinput!=200) {

            System.out.println( "the number input = "+ 100/userinput);


            System.out.println("Enter the number : ");
             userinput = input.nextInt();

            
        }


      

        
        
        
        
        


    }


   
    
}
