package com.Java_Kunal_Lec;

public class Intro_to_Recursion {
    public static void main(String[] args) {
//        message(5);
//        number(1);
//        reverse_number(1);
//        System.out.println(fibo(50));
        int[] arr = {1,2,4,5,6,7,8,9,11,12,16,80};
      int ans =  Binary_seaech_using_recursion(arr,77,0, arr.length-1);
        System.out.println(ans);
    }
    public static void message(int n){
        if (n>0){
            System.out.println("Hello world");
            message(n-1);
        }
    }
    public static void number(int n){
        if (n<=5){
            System.out.println("Number -> "+n);
            number(n+1);
        }
    }
    public static void reverse_number(int n){
       if (n<5){
           reverse_number(n+1);
       }
        System.out.println("reverse number -> "+n);

    }

    public static int fibo(int n){
//        base condition
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static int Binary_seaech_using_recursion(int[] arr , int target , int s , int e){
        if (s>e){
            return -1;
        }
        int m = s + (e - s)/2;
        if (arr[m]==target){
            return m ;
        }
        if (target<arr[m]){
          return   Binary_seaech_using_recursion(arr,target,s,m-1);
        }
        return Binary_seaech_using_recursion(arr,target,m+1,e);
    }

}
