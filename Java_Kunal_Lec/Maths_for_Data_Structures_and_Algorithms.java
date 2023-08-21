package com.Java_Kunal_Lec;

public class Maths_for_Data_Structures_and_Algorithms {
    public static void main(String[] args) {

//        Q1:Check for prime

//        int n = 10 ;
//        for (int i = 1; i < n; i++) {
//            System.out.println(i + " " + isPrime(i));
//        }

//        Q2:Sieve

        int n = 40 ;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);

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
}
