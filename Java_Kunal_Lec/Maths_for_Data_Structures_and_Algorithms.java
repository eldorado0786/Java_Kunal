package com.Java_Kunal_Lec;

import java.util.ArrayList;

public class Maths_for_Data_Structures_and_Algorithms {
    public static void main(String[] args) {

//        Q1:Check for prime

//        int n = 10 ;
//        for (int i = 1; i < n; i++) {
//            System.out.println(i + " " + isPrime(i));
//        }

//        Q2:Sieve

//        int n = 40 ;
//        boolean[] primes = new boolean[n+1];
//        sieve(n,primes);

//        Q3:Binary search square root

//        int n = 40;
//        int p = 3;
//
//        System.out.println(sqrt(n,p));
//        System.out.printf("%.3f",sqrt(n,p));


//        Q4:Newton Raphson method for the square root of the number
//        System.out.println(newtonsqrt(40));


//        Q5:printing all the factors of the number
//        factors1(20);
//        factors2(20);//unsorted order
        factors3(20);//sorted order
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c * c <= n ) {
            if (n%c==0){
                return false;
            }
            c++;
        }
       return true;
    }

//    false in array means number is prime
    public static void sieve(int n , boolean[] primes){
        for (int i = 2; i * i <= n ; i++) {
            if (!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n  ; i++) {
            if (!primes[i]){
                System.out.print(i+" ");
            }
        }
    }

    public static double sqrt(int n , int p){
        int s = 0;
        int e = n ;

        double root = 0.0;
        while (s<=e){
            int mid = s + (e-s)/2;
            if (mid*mid==n){
                return mid;
            }
            if(mid * mid > n){
                e = mid-1;
            }else {
                s = mid +1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n){
                root+= incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }

    public static double newtonsqrt(double n){
        double x = n ;
        double root;
        while (true){
             root = 0.5 * (x+(n/x));

            if (Math.abs(root-x)<0.5){
                break;
            }
            x = root;
        }
        return root;
    }

    public static void factors1(int n ){
        for (int i = 1; i <= n ; i++) {
         if (n%i==0){
             System.out.print(" "+i);
         }
        }
    }

    public static void factors2(int n ){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n%i==0){
                if (n/i==i){
                    System.out.print(i);
                }else {
                    System.out.print(i+" "+n/i+" ");

                }
            }
        }
    }

    public static void factors3(int n ){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n%i==0){
                if (n/i==i){
                    System.out.print(i);
                }else {
                    System.out.print(i+" ");
                    arr.add(n/i);
                }
            }
        }
        for (int i = arr.size()-1; i >= 0 ; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
