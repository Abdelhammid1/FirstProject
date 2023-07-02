package com.jstgo.trainee;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.w3c.dom.DOMImplementation;

import java.util.Scanner;
//@SpringBootApplication
public class Demo {

     static void  AskPeople(){
         // SpringApplication.run(Demo.class, args);
         String NameCar, BrandCar, ColorCar, AddCar;
         Double PriceCar;
         Scanner WriteWord = new Scanner(System.in);
         Scanner WriteNumber = new Scanner(System.in);
         System.out.print("Enter Name Of Car ");  // Output user input
         NameCar = WriteWord.nextLine();

         System.out.print("Enter Brand ");  // Output user input
         BrandCar = WriteWord.nextLine();

         System.out.print("Enter Color ");  // Output user input
         ColorCar = WriteWord.nextLine();

         System.out.print("Enter Price ");  // Output user input
         PriceCar = Double.valueOf(WriteNumber.nextLine());

         System.out.println("Name of Car is : " + NameCar + ", Brand is " + BrandCar +
                 ", Color is " + ColorCar + " and price = " + PriceCar + "$");

    }
    public static void main(String[] args) {
         String NewCar = "yes";

         while (NewCar.equals("yes")){
             AskPeople();
             Scanner input = new Scanner(System.in);
             System.out.print("Do you want add car ");
             NewCar = input.nextLine();
         }
//        System.out.print("Enter Name Of Car ");  // Output user input
//        NameCar = WriteWord.nextLine();
//
//        System.out.print("Enter Brand ");  // Output user input
//        BrandCar = WriteWord.nextLine();
//
//        System.out.print("Enter Color ");  // Output user input
//        ColorCar = WriteWord.nextLine();
//
//        System.out.print("Enter Price ");  // Output user input
//        PriceCar = Double.valueOf(WriteNumber.nextLine());
//
//        System.out.println("Name of Car is : " + NameCar + ", Brand is " + BrandCar +
//                ", Color is " + ColorCar + " and price = " + PriceCar + "$");
//

    }

}
