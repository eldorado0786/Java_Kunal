package com.Java_Kunal_Lec.OOP_5_Abstract_Classes_Interfaces_Annotations_41;

public class Son extends Parent{

    @Override
    void career(String name) {
        System.out.println("career function of "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Partner function of "+name+" age "+age);
    }
}
