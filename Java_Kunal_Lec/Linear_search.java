package com.Java_Kunal_Lec;

public class Linear_search {
    public static void main(String[] args) {
//        Q1:program to find the number using the linear search

//        int[] nums = {1,2,3,4,5,6};
//        int res = linearSearch(nums, 26);
//        if (res==-1){
//            System.out.println("Number not found");
//        }else {
//            System.out.println("Number found at index : "+res);
//        }

//         Q2:program to search char at  the string using the linear search

//        String name = "Atif";
//        char target = 'w';
//        boolean res =  search(name,target);
//        search_using_char_array(name,target);
//        if (res){
//            System.out.println("Found the char ");
//        }else {
//            System.out.println("not found ");
//        }

//        Q3:program to find the number in between the ranges
//        int[] nums = {1,2,3,4,5,6};
//        int start=2;
//        int end = 5;
//        int res = linearSearch_in_range(nums, 6,start,end);
//        if (res==-1){
//            System.out.println("Number not found");
//        }else {
//            System.out.println("Number found at index : "+res);
//        }

//        Q4:program to find the minimum number among the array
//        int[] nums = {18,2,3,4,1,6};
//         min_value(nums);

//        Q5:Given an array nums of integers, return how many of them contain an even number of digit - leet-code-problem
        int[] nums = {12,345,25,6,7896};
        int result = event_number(nums);
        System.out.println("Even digit number in the array is : "+result);

    }

    //    search in the array:return the index if item found
//    otherwise if item not found return -1
    public static int linearSearch(int[] arr,int targert){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==targert){
                return i;
            }
        }
        return -1;
    }


//    searching the char at the string using the linear search

    public static boolean search(String str,char target){

        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }

        return false;
    }

//    searching the string by breaking it into character

    public static void search_using_char_array(String str,char target){
        char[] ch = str.toCharArray();//converting the string into char array
        for (int i = 0; i < str.length(); i++) {
            if (target == ch[i]){
                System.out.println("found the character at the index " + i);
                return;
            }
        }
        System.out.println("character not found ");
    }

    //    searching the number between the range
    public static int linearSearch_in_range(int[] arr,int target,int s , int e){


        for (int i = s; i <= e; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //    finding the min value in the array
    public static void min_value(int[] arr){
        int minvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minvalue>arr[i]){
                minvalue=arr[i];
            }
        }
        System.out.println("Minimum value -> "+minvalue);
    }

    //    finding event digit number in the array
    public static int event_number(int[] nums){
        int evenNumber = 0;
        int check = 0 ;
        for (int i = 0; i < nums.length; i++) {
            check=0;
            int num = nums[i];
            while (num>0){
                num = num/10;
                check++;
            }
            if (check%2==0){
                evenNumber++;
            }
        }
        return evenNumber;
    }
}
