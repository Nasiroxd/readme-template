package Java_booking_list.Matrik_Math;

import java.io.Serializable;

public   class Cat  extends  Animal implements Serializable {


   String name;
   String color;

   int age;


   public  Cat(String name, String color, int age){
     super.name = name;
      super.color = color;
      super.age = age;


   }

   public  Cat(){
      super.name = "Basic cat";
   }

   @Override
   public  void eat(){
      System.out.println("Bacis Cat");

   }

   @Override
   public  String  getName(){
      return super.name;

   }
   @Override
   public  String  getColor(){
      return super.color;

   }
   @Override
   public  int  getAge(){
      return super.age;

   }




}


