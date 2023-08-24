package com.Java_Kunal_Lec;

import java.util.ArrayList;

public class Recursion_Array_Question {
    public static void main(String[] args) {
//        Q1:Checking if the array is sorted or not
//        int[] arr = {1,2,4,5,6,8};
//        System.out.println(sorted(arr,0));

//        Q2:linear search with recursion
//        int[] arr = {2,3,1,4,5};
//        System.out.println(find(arr,4,0));
//        System.out.println(findindex(arr,4,0));
//        System.out.println(findindexformlast(arr,4,arr.length-1));

//        Q3:Finding the samenumber number on multiple index
//        int[] arr = {2,3,1,4,4,5};
//        findAllindex(arr,4,0);
//        System.out.println(list);

//        Q4:Rotated Binary Search

        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,8,0,arr.length-1));

    }
    public static boolean sorted(int[] arr,int index){
//        base condition
        if (index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }

    public static boolean find(int[] arr,int target,int index){
        if (index==arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    public static int findindex(int[] arr,int target,int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return   findindex(arr,target,index+1);

        }
    }
    public static int findindexformlast(int[] arr,int target,int index){
        if (index==-1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return   findindexformlast(arr,target,index-1);

        }
    }

   static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllindex(int[] arr,int target,int index){
        if (index==arr.length){
            return ;
        }
        if (arr[index] == target){
            list.add(index);
        }
              findAllindex(arr,target,index+1);


    }

    public static int search (int[] arr,int target , int s ,int e ){
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if (arr[s]<=arr[m]){
            if (target>=arr[s] && target<=arr[m]){
                search(arr,target,s,m-1);
            }else {
                return search(arr,target,m+1,e);
            }
        }
        if (target>=arr[m]&&target<=arr[e]){
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);
    }
}
