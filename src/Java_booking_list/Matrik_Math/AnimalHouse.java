package Java_booking_list.Matrik_Math;

import java.io.Serializable;

public class AnimalHouse <T extends  Animal & Serializable> {


    private T animal;
    public  AnimalHouse(){
        System.out.println("Generics number "+this.getClass().getSimpleName() + " Created");
    }

    public void add(T animal){
        this.animal = animal;
        System.out.println("Hi my Name is :  " + animal.getName());
        System.out.println("Kind :  " + animal.getClass().getSimpleName());
        System.out.println("Color :  "+ animal.getColor());
        System.out.println("Iam "+ animal.getAge()+ " Years Old");
        animal.eat();
        System.out.println(".....................");

    }

    public T get(){
        return animal;
    }


}
