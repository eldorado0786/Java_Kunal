package com.Java_Kunal_Lec;

public class Recursion_level_1 {
    public static void main(String[] args) {

//        Q1:Print the number tills n times in reverse order
//        print_till_n_reverse(5);

//        Q2:Print the number tills n times
//        print_till_n(5);

//        Q3:Product of  n to 1
//        System.out.println(factorial_of_n(5));

//        Q4:Sum of n to 1
//        System.out.println(sum_to_n(5));

//        Q5:Sum of digits
//        System.out.println(sum_of_digits(1234));

//        Q6:Products of numbers
//        System.out.println(product_of_number(1234));

//        Q7:Reverse a number
//        reverse1(1234);
//        System.out.println(sum);
//        System.out.println(reverse2(1234));

//        Q8:Check the given number is palindrome or not
//        System.out.println(palin(1234321));

//        Q9:Count zeros
//        System.out.println(count_zero(1023040));


    }
    public static void print_till_n_reverse(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        print_till_n_reverse(n-1);
    }

    public static void print_till_n(int n){
        if (n==0){
            return;
        }
        print_till_n(n - 1);
        System.out.println(n);

    }

    public static int factorial_of_n(int n){
        if (n==1){
            return n;
        }
     int sum =   factorial_of_n(n-1);

        return n*sum;
    }

    public static int sum_to_n(int n ){
        if (n==1){
            return n;
        }
        int sum = sum_to_n(n-1);
        return sum+n;
    }

    public static int sum_of_digits(int n){
        if (n==0){
            return n;
        }
        return (n%10)+sum_of_digits(n/10);
    }

    public static int product_of_number(int n){
        if (n==0){
            return n;
        }
        return (n%10)*sum_of_digits(n/10);
    }

   static int sum = 0 ;

    public static void reverse1(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10+rem;
        reverse1(n/10);
    }

    public static int reverse2(int n){
//        sometimes you might need some additional variables in the argument
//        in that case, make another function
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n , int digits){
        if (n%10==n){
            return n;
        }
        int rem = n %10;
        return rem* (int) (Math.pow(10,digits-1))+helper(n/10,digits-1);
    }


    public static int rev(int n){
//        sometimes you might need some additional variables in the argument
//        in that case, make another function
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    public static boolean palin(int n){
        return (n==rev(n));
    }

    public static int count_zero(int n){
        return counter_helper(n,0);
    }
    private static int counter_helper(int n , int c){
        if (n==0){
            return c;
        }
        int rem = n %10;
        if (rem==0){
            return counter_helper(n/10,c+1);
        }
        return counter_helper(n/10,c);
    }

}
