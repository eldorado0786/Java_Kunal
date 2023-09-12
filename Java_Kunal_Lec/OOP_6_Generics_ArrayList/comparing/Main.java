package com.Java_Kunal_Lec.OOP_6_Generics_ArrayList.comparing;

public class Main {
    public static void main(String[] args) {
        Student Atif = new Student(12,89.5f);
        Student Raza = new Student(13,90.5f);
        if (Atif.compareTo(Raza)<0){
            System.out.println("Raza has more marks");
        }
    }
}
