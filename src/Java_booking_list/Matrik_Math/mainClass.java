package Java_booking_list.Matrik_Math;

import Java_booking_list.Dog;
import Java_booking_list.Dog2;

public class mainClass {
    public static void main(String[] args) {

        House house = new House();

//        Object cat = new Cat("Ponny","White",2);
//        Object dog = new Dogs("Robbert","Red",6);
//        house.add(cat);
//        house.add(dog);
//
//        Integer num = 5;
//       int number =  house.add(num);
//
//        System.out.println(number);

        AnimalHouse <Cat> cathouse = new AnimalHouse();
        cathouse.add(new Cat("Robbert","white",2));
        Cat mycats = cathouse.get();

        AnimalHouse <Dogs> doghouse = new AnimalHouse();
        doghouse.add(new Dogs("Ponny","white",6));
        Dogs mydog = doghouse.get();







//        generics gen = new generics();
//        gen.printer(5);
//
//        generics doubleapp = new generics();
//        doubleapp.printer(5.5);
//
//        generics integerNumber = new generics();
//        integerNumber.printer(10);

//        generics <Integer> outputNumber = new generics();
//        outputNumber.printer(30);
//        outputNumber.printer(40);
//        outputNumber.printer(50);
//        outputNumber.printer(2L);
//        outputNumber.printer(60.5 + "L");
//        outputNumber.printer(new catClass());


//        generics doubleNumber = new generics();
//        doubleNumber .printer(10.5);

//        generics integerNumber5 = new generics();
//        integerNumber5.printer(15);
//
//        generics doubleNumber5 = new generics();
//        doubleNumber5 .printer(15.5);

//
//        generics <Integer> numbers = new generics<>();
//        numbers.printer(20);
//
//        generics <Double> numbers1 = new generics<>();
//        numbers1.printer(20.5);

//        GenericsPrinter genericsPrinter = new GenericsPrinter();
//        genericsPrinter.printNumber(10);






        
    }
    
}
