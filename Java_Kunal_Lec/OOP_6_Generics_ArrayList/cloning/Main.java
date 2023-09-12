package com.Java_Kunal_Lec.OOP_6_Generics_ArrayList.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Atif = new Human(21,"Raza");
//        Human Twin = new Human(Atif);//we can do in this way
        Human Twin2 = (Human) Atif.clone();
        System.out.println(Twin2.age+" "+Twin2.name);
        System.out.println(Arrays.toString(Twin2.arr));
        Twin2.arr[0] = 100;
        System.out.println(Arrays.toString(Twin2.arr));
        System.out.println(Arrays.toString(Atif.arr));

    }
}
