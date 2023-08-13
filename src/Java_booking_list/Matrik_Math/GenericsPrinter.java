package Java_booking_list.Matrik_Math;

import Java_booking_list.Dog;

public class GenericsPrinter {
    public <T extends Number> void printNumber(T t){
        System.out.println(t);


    }
    public <T extends Animal> void printAnimal(T t) {
        System.out.println(t.getName());
    }

    public void printAnimal(Cat cat) {
    }

    public void printAnimal(Dog dog) {
    }
}
