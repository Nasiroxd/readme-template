package Java_booking_list.Matrik_Math;

public class GenericsPrinter {
    public <T extends Number> void printNumber(T t){
        System.out.println(t);


    }
    public <T extends catClass> void printCat(T t) {
        System.out.println(t);
    }
}
