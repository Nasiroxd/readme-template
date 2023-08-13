package Java_booking_list.Exemples;

public class INRCurrentyConvetre extends CurrentyConvetre {
    public double converter(double amt){
        System.out.println("INR Convert");
        double rate = 2.00;
        return amt * rate;

    }
}
