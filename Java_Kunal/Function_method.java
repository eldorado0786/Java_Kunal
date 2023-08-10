package com.Java_Kunal;
import java.util.Arrays;
import java.util.Scanner;

public class Function_method {
    public static void main(String[] args) {


//        Q1:Take the input of 2 numbers and print the sum


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the first number : ");
//        int num1 = input.nextInt();
//        System.out.print("Enter the second number :");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum = "+sum);

//        Q2:Take the input of 2 numbers and print the sum using the function
//        sum();


//        Q3:Displaying Hello world
//        greeting();


//        Q4:Creating a function where we return the value

//        int res = sum_of_two_num();
//        System.out.println("Sum is : "+res);


//        Q5:Function to return the string


//        String mess = greet();
//        System.out.println(mess);


//        Q6:Function takeing input as arguments for the sum

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the first number : ");
//        int num1 = input.nextInt();
//        System.out.print("Enter the second number : ");
//        int num2 = input.nextInt();
//        int result = add(num1, num2);
//        System.out.println("Result of the sum of two number is : " +result);


//        Q7:Function to display greeting on the screen with the arguments

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your Name : ");
//        String name = input.next();
//        System.out.println(Message(name));


//        Q8:Program to swap the two number by pass by value

//        int a = 10 ;
//        int b = 20 ;
//        swap(a,b);


//        Q9:Program to swap number using the pass by reference

//        int [] arr = {1,3,2,4,5,6};
//        swap_arr(arr);
//        System.out.println(Arrays.toString(arr));



//        Q10:Program to check the number is prime of not

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check if it is prime or not : ");
        int num1 = input.nextInt();
        prime(num1);
    }
    //    function to add two number
    public static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = "+sum);
    }

    //    function to print Hello world!
    public static void greeting(){
        System.out.println("Hello world!");
    }

    //    function to return the sum of two number
    public static int sum_of_two_num (){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    //    function to return the string
    public static String greet() {

        String greeting = "Learning Java";
        return  greeting;
    }

    //    function taking arguments for the sum of the two number and returning the result
    public static int add(int a,int b){
        int sum = a+b;
        return sum;
    }

    //    function take arguments for the message
    public static String Message(String name) {
        String mess = "Hello "+name;
        return mess;
    }


    //Function to swap the two number using the pass by value
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A-> "+a+" B-> "+b);
    }

    //    Function to swap the number using the pass by reference using array
    public static void swap_arr(int[] arr) {
        arr[0] = 99;
    }

    public static void prime(int num){
        boolean isPrime = false;
        for (int i = 2; i*i < num ; i++) {

            if (num%i==0){
                isPrime=true;
                break;
            }
        }
        if (isPrime){
            System.out.println("not a Number  prime");
        }else {
            System.out.println("prime number ");
        }

    }
}
