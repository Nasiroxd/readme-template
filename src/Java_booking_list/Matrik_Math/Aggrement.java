package Java_booking_list.Matrik_Math;

import java.util.ArrayList;
import java.util.List;

public class Aggrement{

    public int  sum(List<? extends Animal> NumberList){
        int ages = 0;
        for (Animal animal : NumberList){
            ages += animal.getAge();
        }

        return  ages;
    }

    public static void main(String[] args) {

        //lower case of counsumer number .........
        List<? super Animal> animal = new ArrayList<>();
        animal.add(new Cat());
        animal.add(new Dogs());
        //double list to list........

      List<List <? super Animal>> anims = new ArrayList<>();
        anims.add(List.of(new Cat()));
        anims.add(List.of(new Dogs()));

        //sum of list number..........
        Aggrement aggrement = new Aggrement();
        List<Dogs> dogs = new ArrayList<>();
        dogs.add(new Dogs("Punny","Green",2));
        dogs.add(new Dogs("Punny","Green",2));
        int numbers = aggrement.sum(dogs);

        System.out.println(numbers);

        //Upper case ..........
        List<? extends  Animal> animals = new ArrayList<>();
        List<Dogs> dog = new ArrayList<>();
        dog.add(new Dogs());
        animals = dog;
    }


}
