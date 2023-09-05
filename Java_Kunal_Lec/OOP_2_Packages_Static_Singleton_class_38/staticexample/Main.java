package com.Java_Kunal_Lec.OOP_2_Packages_Static_Singleton_class_38.staticexample;

public class Main {
    public static void main(String[] args) {
//        Human atif = new Human(22, "Atif", 10000, false);
//        Human mayank = new Human(21,"Mayank",15000,true);
//
//        /* Printing the data from the given object */
//        System.out.println(atif.name);
//        System.out.println(mayank.age);
//        System.out.println(mayank.population);
//        System.out.println(atif.population);

    }
    /* This is not dependent on objects */
    static void fun(){
//        greeting();//you cant use this because it requires an instance
        //but the function you are using it in does not depend on instances
        /* You cannot access non static stuff without referencing their instances in a static context  */
        /* Hence , here I am referencing it using object */
        Main obj = new Main();
        obj.greeting();
    }
    /* We know that something which is not static , belongs to an object */
    void greeting(){
        System.out.println("Hello World!");
    }

}
