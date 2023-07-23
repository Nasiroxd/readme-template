package Java_booking_list.Matrik_Math;

public class matrik1 {
    public static void main(String[] args) {

        int[][]number = new int[2][3];
        int[][] num1 = new int[2][3];
        int[][] c = new int[2][3];

        number[0][0] = 3;
        number[0][1] = 1;
        number[0][2] = 2;
        number[1][0] = 1;
        number[1][1] = 4;
        number[1][2] = 1;

        num1[0][0] = 1;
        num1[0][1] = -5;
        num1[0][2] = -2;
        num1[1][0] = -3;
        num1[1][1] = 2;
        num1[1][2] = 4;


        System.out.println("1/3B = ");
         for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                c[i][j] = num1[i][j]/1/3;
                System.out.print(" " + c[i][j]);

                
                 

            }
              System.out.println();

       }

        
       for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                 System.out.print(" " + number[i][j]);
                 

            }
              System.out.println();

       }

        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                 System.out.print(" " + num1[i][j]);
                 

            }
              System.out.println();

       }

           System.out.println("A+B = ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){

                System.out.print("\t " + (number[i][j] + num1[i][j]));


            //    c[i][j] =   number[i][j] + num1[i][j];
            //        System.out.println("\t" + c[i][j]);

                 

            }

             System.out.println();

             

       }

           

      
        
      
        
         

    }




    
}
