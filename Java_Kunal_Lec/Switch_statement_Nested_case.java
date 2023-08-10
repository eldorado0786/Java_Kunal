package com.Java_Kunal_Lec;
import java.util.Scanner;
public class Switch_statement_Nested_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        1.program to take fruits name input and display its name using switch cases


//        System.out.print("Enter the fruit name : ");
//        String fruit_name = input.next();
//        switch (fruit_name) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }


//        2.program to print the employee details


        System.out.print("Enter the Employee id : ");
        int emp_id = input.nextInt();
        System.out.println();
        System.out.print("Enter the Employee department : ");
        String dep = input.next();
        System.out.println();
        switch (emp_id) {
            case 1 -> System.out.println("MD ATIF ");
            case 2 -> System.out.println("Raza");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (dep) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department employee");
                }
            }
            default -> System.out.println("Enter the correct Employee ID");
        }
    }
}
