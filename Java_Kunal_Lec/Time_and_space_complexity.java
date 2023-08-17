package com.Java_Kunal_Lec;

public class Time_and_space_complexity {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fibonaciFormula(i));
        }

    }
    public static int fibonaciFormula(int n){
       return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
