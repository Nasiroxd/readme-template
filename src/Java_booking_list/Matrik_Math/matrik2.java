package Java_booking_list.Matrik_Math;

public class matrik2 {
    public static void main(String[] args) {
        int[][] num1 = new int[2][3];
        int[][] c = new int[2][3];
        


        num1[0][0] = 1;
        num1[0][1] = -5;
        num1[0][2] = -2;
        num1[1][0] = -3;
        num1[1][1] = 2;
        num1[1][2] = 4;

        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                c[i][j] = 0;
                for(int k =0; k<3; k++){
                    c[i][j]+=num1[i][j]/1*3;

                }
                System.out.print(" " + c[i][j]);
                
            }
            System.out.println();
        }


     int arry[] = {3,4,5,1,6,7,8,9,10};

   int n = arry.length+1;

   int sum = (n*(n+1))/2;

   for(int i = 0; i<arry.length; i++){
    sum = sum - arry[i];
   }

    System.out.println("Multipassing number : "+ sum);
   
}  
}
