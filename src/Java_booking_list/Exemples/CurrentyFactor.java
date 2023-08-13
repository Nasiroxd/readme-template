package Java_booking_list.Exemples;

public class CurrentyFactor {
    public CurrentyConvetre getConverter(String type) {
        if (type.equals("USD")) {
            return new USDCurrentyConvetre();


        } else if (type.equals("INR")) {
            return new INRCurrentyConvetre();

        } else if (type.equals("EUR")) {
            return new EURCurrentyConverter();

        }
        return null;

    }
}
