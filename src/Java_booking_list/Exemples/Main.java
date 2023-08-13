package Java_booking_list.Exemples;

import java.util.Scanner;

public class Main {

    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.whoIam();

        Dog dog= new Dog();
        animal.whoIam();




        Calculator c = new Calculator();
        c.add(10,20);

//        CurrentyConvetre currentyConvetre = new CurrentyConvetre();
//       double amount =  currentyConvetre.converter(40);
//        System.out.println("Amount "+ amount);


        String type = "EUR";

//        CurrentyConvetre currentyConvetre = null;
//
//
//        if (type.equals("USD")){
//          currentyConvetre = new USDCurrentyConvetre();
//
//
//
//        }else if (type.equals("INR")){
//           currentyConvetre = new INRCurrentyConvetre();
//
//
//        }



        double result = getAmount(40);


        System.out.println("Amount :  "+ getCurrenty("USD",result));
        System.out.println("Amount :  "+ getCurrenty("INR",result));

        System.out.println("Amount :  "+ getCurrenty("EUR",result));













    }

    public static double getAmount(double amount){

        amount = 40;

        CurrentyConvetre currentyConvetre = new EURCurrentyConverter();
        amount = currentyConvetre.converter(amount);


        return amount;
    }
    public static double getCurrenty(String type , double amt){
        CurrentyFactor factor = new CurrentyFactor();
        CurrentyConvetre currentyConvetre = factor.getConverter(type);
//        amount = currentyConvetre.converter(amount);


        return currentyConvetre.converter(amt);


    }
}
