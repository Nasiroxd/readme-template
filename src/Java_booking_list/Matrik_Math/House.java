package Java_booking_list.Matrik_Math;

public class House {

    public void add(Object obj){
        Animal animal = (Animal) obj;

        System.out.println("Hi my Names : "+ animal.getName());
        System.out.println("Kinds : "+ animal.getClass().getSimpleName());
        System.out.println("Color : "+ animal.getColor());
        System.out.println("iam "+animal.getAge() + " Years Old");
        animal.eat();
        System.out.println(".............................");


    }
    public  void add(Animal animal){
        System.out.println("Hi my Names : "+ animal.getName());
        System.out.println("Kinds : "+ animal.getClass().getSimpleName());
        System.out.println("iam "+animal.getAge()+"Years Old");
        animal.eat();
        System.out.println(".............................");



    }
}
