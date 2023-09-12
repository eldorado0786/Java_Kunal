package com.Java_Kunal_Lec.OOP_6_Generics_ArrayList.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 8, 6, 9};
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{
////        this is shallow copy
//        return super.clone();
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
//        this is Deep copy
        Human Twin2 = (Human) super.clone();//this is actually shallow copy
//        make a deep copy
        Twin2.arr = new int[Twin2.arr.length];
        for (int i = 0; i < Twin2.arr.length; i++) {
            Twin2.arr[i] = this.arr[i];
        }
        return Twin2;
    }

}
