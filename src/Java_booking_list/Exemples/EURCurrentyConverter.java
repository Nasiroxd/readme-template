package Java_booking_list.Exemples;

public class EURCurrentyConverter  extends CurrentyConvetre{
    @Override
    public double converter(double amt) {
        System.out.println("EUR Convert");
        return amt * 100.0;
    }
}
