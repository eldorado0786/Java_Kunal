package com.Java_Kunal_Lec.OOP_2_Packages_Static_Singleton_class_38.b;
/* Importing the function from another file  */
import static com.Java_Kunal_Lec.OOP_2_Packages_Static_Singleton_class_38.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello world");
        /* This function is being called from the another file called Message */
        message();
    }
}
