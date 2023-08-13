package Java_booking_list.Exemples;

public class USDCurrentyConvetre extends CurrentyConvetre {
    public double converter(double amt){
        System.out.println("USD Convert");
        double rate = 80.00;
        return amt * rate;

    }
}
