package Java_booking_list.Matrik_Math;

import java.io.Serializable;

public   class Dogs extends  Animal implements Serializable {


   String name;
   String color;

   int age;


   public Dogs(String name, String color, int age){
     super.name = name;
      super.color = color;
      super.age = age;


   }

   public Dogs(){
      super.name = "Basic cat";
   }

   @Override
   public  void eat(){

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


