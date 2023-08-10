package com.Java_Kunal;

public class Binary_Search {
    public static void main(String[] args) {
//        Q1:Assuming the array is sorted in ascending array
//        int[] arr = {2,3,4,5,6,7,15};
        int[] arr = {15,7,6,5,4,3,2};
        int target = 6;
//        int ans = binary_search(arr,target);
//        System.out.println("Answer -> "+ans);


//        Q2:Agnostic binary search
        int ans = order_agnostic(arr,target);
        System.out.println("Index of the target -> "+ans);
    }

    //    return the index
//    return the -1 when index not found
    public static int binary_search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
//            find middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    //    Order agnostic binary search
    public static int order_agnostic(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;

//        find whether the array is sorted in ascending or decending
        boolean isArc = arr[start]<arr[end];



        while (start <= end) {
//            find middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isArc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}