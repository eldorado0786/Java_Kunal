package com.Java_Kunal_Lec.OOP_2_Packages_Static_Singleton_class_38.staticexample;

public class Static_Bloack {
    /* This is a demo to show initialisation of static variables */
    static int a = 4 ;
    static int b ;
    /* Will only run once , when the first obj is created i.e when the class is loaded for the first time */
    static {
        System.out.println("I am in static block ");
        b = a * 5 ;
    }

    public static void main(String[] args) {
        Static_Bloack obj = new Static_Bloack();
        System.out.println(Static_Bloack.a+" "+Static_Bloack.b);

        Static_Bloack.b += 3;
        System.out.println(Static_Bloack.a+" "+Static_Bloack.b);

        Static_Bloack obj2 = new Static_Bloack();
        System.out.println(Static_Bloack.a+" "+Static_Bloack.b);
    }
}
