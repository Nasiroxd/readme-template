package Java_booking_list.The_Guessing_game;


public class GuessGame{ 

    Player p1;
    Player p2;
    Player p3;

    
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

   

   

   
    
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
       
                    

    int targetNumber = (int) (Math.random() *10);
    System.out.println("im thaking of a number between 0 and 9.....");

     while (true) {


        System.out.println("Number to guess is : " + targetNumber);
        System.out.println("iam guessing " +targetNumber);
       
        guessp1 = p1.number;
        System.out.println("Player one guessed " + guessp1);
        guessp2 = p2.number;
        System.out.println("Player one guessed " + guessp2);
        guessp3 = p3.number;
        System.out.println("Player one guessed " + guessp3);

        if (guessp1 == targetNumber) {
            p1isRight = true;
        } if (guessp2 == targetNumber) {
            p2isRight = true;
        } if (guessp3 == targetNumber) {
            p3isRight = true;
        }
        if (p1isRight || p2isRight || p3isRight) {
            System.out.println("we have a Winner!!!");
            break;
            
            
        }
        System.out.println("iam guessing " +targetNumber);
        
    }
   


   
    
       
    }
    

    

    


    



   

    
}
