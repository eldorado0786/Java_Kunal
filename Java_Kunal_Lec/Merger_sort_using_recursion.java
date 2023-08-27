package com.Java_Kunal_Lec;

import java.util.Arrays;

public class Merger_sort_using_recursion {
    public static void main(String[] args) {
//        Q1: Sort the array using the merge sort using the recursion
        int[] arr = {8,3,4,12,5,6};
        arr = merge_sort_using_recursion(arr);
        System.out.println(Arrays.toString(arr));


     }
      public static int[] merge_sort_using_recursion(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = merge_sort_using_recursion(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge_sort_using_recursion(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
     }
     private static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+ second.length];
        int i = 0;
        int j = 0;
        int k = 0 ;
        while (i< first.length && j < second.length){
            if (first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
//        it may be possible that  one of the arrays may be not complete
//         copy the remaining element
         while (i< first.length){
             mix[k] = first[i];
             i++;
             k++;

         }
         while (j< second.length){
             mix[k] = second[j];
             j++;
             k++;

         }

         return mix;
     }
}
