package com.Java_Kunal_Lec;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Conditionals_and_loops_Calculator_program {
    public static  void main(String[] args) {


//        1.program to add bonus using single if-else  condition statement



//          int salary = 25400;
//          if (salary>10000){
//              salary+=2000;
//          }else {
//              salary+=1000;
//          }
//        System.out.println("Salary of the employee is -> " + salary);




//        2.program to add bonus using single if-else-if   condition statement



//        if (salary<10000){
//            salary+=2000;
//        } else if (salary>20000){
//            salary+=3000;
//        }else {
//            salary+=1000;
//        }
//        System.out.println("Salary of the employee is -> " + salary);



//        3.program to print hello world 5 time

//        int num = 0 ;
//        while (num<5){
//            System.out.println("Hello world");
//            num++;
//        }


//        4.program to print number from 1 to 5

//        for (int num = 1 ; num<=5 ; num++){
//            System.out.println(num);
//        }


//        5. program to print number from 1 to n

        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the number to print till it ");
//        int num = input.nextInt();
//
//        for (int i = 1 ; i <= num ;i++){
//            System.out.println(i);
//        }

//        6.program to print the number using while loop


//        int num = 1 ;
//
//        while (num<=5){
//            System.out.println(num);
//            num++;
//        }


//        7.program to print the number using do-while loop
//        int num = 1;
//        do {
//            System.out.println(num);
//        }while (num!=1);

//        8.program to find the largest number among the three number using if

//        System.out.println("Enter the three number to find the greatest among the three :");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//        int max = 0 ;
//
//         max = num1 ;
//
//
//        if (num2>max){
//            max=num2;
//        }
//        if (num3>max){
//            max=num3;
//        }
//        System.out.println("Maximum number among the three is -> "+max);

//        9.program for the trim function

//        char ch = input.next().trim().charAt(0);
//        System.out.println("removing the unwanted space and printing the first first letter -> "+ch);

//        10. program for the fibonaci series

//        int a = 0;
//        int b = 1;
//        System.out.println("Enter the number to print the fibonaci series till it :");
//        int n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            int c = a+b;
//            System.out.println(c);
//            a=b;
//            b=c;
//        }

//        11.program to find the repative of the certain number




//        System.out.println("Enter the number to find the repetation");
//        int num = input.nextInt();
//        System.out.println("Enter the number to find its repetaion");
//        int n = input.nextInt();
//        int count = 0 ;
//        while (num>0){
//            if (n==num%10){
//                count++;
//            }
//            num/=10;
//
//        }
//        System.out.println("Frequency is -> "+count);



//        12.Program to print the number in reverse
//
//        System.out.println("Enter the number to print it in the reverse : ");
//        int num = input.nextInt();
//        int ans = 0 ;
//        while (num>0){
//            ans = (ans *10) + (num%10);
//            num/=10;
//        }
//        System.out.println("Number -> "+ans);





//        13.program of calculator





//        Take input from the user till it does not press X or x
        while (true){
            int ans = 0 ;
//            take the operator as input
            System.out.println("Enter the operator");
            char op = input.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
//                input two number
                System.out.println("Enter the two number -> ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op=='+'){
                    ans = num1+num2;
                }
                if (op=='-'){
                    ans = num1-num2;
                }
                if (op=='*'){
                    ans = num1*num2;
                }
                if (op=='/'){
                    if (num2 != 0){
                        ans = num1/num2;
                    }
                }
                if (op=='%'){
                    ans = num1%num2;
                }
            } else if (op=='X'||op=='x') {
                break;
            }else {
                System.out.println("Invalid operator");
            }
            System.out.println("Answer -> "+ans);
        }


    }
}
