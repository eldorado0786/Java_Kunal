package com.Java_Kunal_Lec;

public class Bit_wise_operators {
    public static void main(String[] args) {
//        Q1:Find if the number is odd or not
//        int n = 3;
//        System.out.println(isOdd(n));

//        Q2:Find the number which is not repeated twice in the array

//        int[] arr = {2,3,3,4,2,6,4};
//        System.out.println(FindUnique(arr));

//        Q3:Find the nth magic number in the array
//        MagicNumber(6);

//        Q4: Finding the number of digits
//        int n = 345671;
//        int b = 10 ;
//     int ans =    NoOfDigits(n,b);
//        System.out.println("Ans -> "+ans);

//        Q5: You have given a number find if it has power 2 or not

//        int n = 16 ;
//        System.out.println(PowOfTwo(n));

//        Q6:Power  Question
//        int base = 3 ;
//        int power = 6;
//        System.out.println(Power(base,power));

//        Q7:Given a number n find the number of set bits ( number of 1 in the binary )
//        int n = 45;
//        System.out.println(SetBets(n));
//        System.out.println(setbets(n));

//        Q8: XOR of all the number between a and b

//        range xor for a,b = xor(b) ^ xor(a-1)
        int a = 3 ;
        int b = 9 ;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
    }
    public static boolean isOdd(int n ){
     return ( n & 1 ) == 1;
    }
    public static int FindUnique(int[] arr){
        int unique = 0 ;
        for (int n : arr){
            unique^=n;
        }
        return unique;
    }

    public static void MagicNumber(int n ){
        int ans = 0 ;
        int base = 5;
        while (n>0){
            int last = n & 1 ;
            n = n >> 1 ;
            ans += last * base;
            base = base * 5 ;
        }
        System.out.println(ans);
    }

    public static int NoOfDigits(int n , int b ){
        return (int) (Math.log(n)/Math.log(b))+1;
    }

    public static boolean PowOfTwo(int n ){
// note:fix for n = 0
       return  (n&(n-1))==0;
    }

    public static int Power(int base,int power){
        int ans = 1;
        while (power>0){
            if ((power&1)==1){
                ans*=base;
            }
            base*=base;
            power = power>>1;
        }
        return ans;
    }

    public static String SetBets(int n){
        return Integer.toBinaryString(n);
    }
    public static int setbets(int n){
        int count = 0 ;
        while (n>0){
            count++;
            n-=(n&-n);// or we can use this one also n = n & (n-1);
        }
        return count;
    }

//    this gives cor from 0 to a
    public static int xor(int a){
        if (a%4==0){
            return a;
        }
        if (a%4==1){
            return 1;
        }
        if (a%4==2){
            return a+1;
        }
      return 0;
    }
}
