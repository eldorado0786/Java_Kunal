package com.Java_Kunal_Lec.OOP_2_Packages_Static_Singleton_class_38.staticexample;

public class Human {
    int age ;
    String name ;
    int salary ;
    boolean married ;
   static long population ;

    public Human(int age, String name, int salary, boolean married) {
        /* This is used to represent the object for object reference  */
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }
}
