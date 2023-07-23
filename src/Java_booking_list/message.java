package Java_booking_list;

public class message {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x<5) {
            // y = x-y;
            // y = y+x;
            // x = x+1;
            // y = y+x;

            y = y+2;
            if (y>4) {
                y = y-1;
                
            }

            System.out.print(x +" "+ y + " ");
            x = x+1;
            
        }
       
    }
}
