package com.Java_Kunal_Lec;

import java.util.Arrays;

public class Recursion_Pattern {
    public static void main(String[] args) {
//        Q1:Print star upside down
//        print_star_upside_down1(4);

//        Q2:Printing star upside using the recursion
//        print_star_upside_down2(5,0);

//        Q3:Bubble sort using recursion
//        int[] arr = {4,3,2,1};
//        bubble_sort_using_rec(arr, arr.length-1,0);
//        System.out.println(Arrays.toString(arr));

//        Q4:Section sort using recursion
        int[] arr = {4,3,2,1};
        selection_sort_using_rec(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
     public static void print_star_upside_down1(int n){
        if (n==1){
            System.out.println("*");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        print_star_upside_down1(n-1);
    }

    public static void print_star_upside_down2(int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
            System.out.print("* ");
            print_star_upside_down2(row,col+1);
        }else {
            System.out.println();
            print_star_upside_down2(row-1,0);
        }
    }

    public static void bubble_sort_using_rec(int[] arr,int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
            if (arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble_sort_using_rec(arr,row,col+1);
        }else {

            bubble_sort_using_rec(arr,row-1,0);
        }
    }

    public static void selection_sort_using_rec(int[] arr,int row , int col,int max){
        if (row==0){
            return;
        }
        if (row>col){
            if (arr[col]>arr[max]){
                selection_sort_using_rec(arr,row,col+1,col);
            }else {
                selection_sort_using_rec(arr, row, col + 1, max);
            }
        }else {
          int temp = arr[max];
          arr[max] = arr[row-1];
          arr[row-1] = temp;
            selection_sort_using_rec(arr,row-1,0,0);
        }
    }
}
