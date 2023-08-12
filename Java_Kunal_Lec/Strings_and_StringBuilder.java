package com.Java_Kunal_Lec;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings_and_StringBuilder {
    public static void main(String[] args) {
//        String name = "Kunal Kushwaha";
//        System.out.println(name);
//
//        String a = "Atif";
//        System.out.println(a);
//        a="Raza";//here we are creating a new object we are not updating  or modifying the existing the object
//        System.out.println(a);
//
////        Here we are comparing the String object
//
//        String aa = "Kunal";
//        String bb = "Kunal";
//
//        //==
//        System.out.println(aa==bb);//true
//
//        String name1 = new String("Atif");
//        String name2 = new String("Atif");
//        System.out.println(name1==name2);
//        //.equals()
//        System.out.println(name1.equals(name2));


//        PrettyPrinting


//float a = 453.1274f;
//        System.out.printf("Formatted Number is :- %.2f",a);
//        System.out.println();
////        Printing the value of the pi
//        System.out.println("Pi value "+Math.PI);
////        printing the value of pi upto 2 decimal point
//        System.out.printf("Pie : %.3f",Math.PI);
//        System.out.println();
////        printing the string using the Pretty printing
//        System.out.printf("hello my name is %s and i am %s ","Atif","Cool");


//        Operators




//        System.out.println('a'+'b');
//        System.out.println("a"+"b");
//        System.out.println((char) ('a'+3));
//        System.out.println("a"+1);//integer will be converted to integer that will call toString()
////        System.out.println("a"+"1"); it will also give the same result
//
//
//        System.out.println("Kunal"+new ArrayList<>());
//        System.out.println("Kunal"+ new Integer(56));
////        System.out.println( new Integer(56)+new ArrayList<>());// it will give error  because both the values are not string to make things works atleast one of it has to be string
//        System.out.println( new Integer(56)+""+new ArrayList<>());//here it is working because one of the is string



//        performance
//    String is  immutable
//        it cannot be edited, but it is being copied and dereference the previous object
//        it wastes too much memory
//        it decreases the performance
//        String series = "";
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a' + i );
//            System.out.println(ch);
//            series = series + " " + ch ;
//
//        }
//
//        System.out.println(series);



//        String Builder is Mutable

//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a'+i);
//            builder.append(ch);
//        }
//
//        System.out.println(builder.toString());


//        Methods

        String name = "MD ATIF RAZA";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('A'));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
