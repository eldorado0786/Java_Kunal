package com.Leet_code;

import java.util.Arrays;

public class First_Missing_Positive_41 {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int ans = firstMissingPositive(arr);
        System.out.println("Answer -> "+ans);
    }
    public static int firstMissingPositive(int[] nums) {
        int index = 0 ;
        while (index < nums.length){
            int correct_index = nums[index]-1;
            if (nums[index]  > 0 && nums[index] < nums.length &&  nums[index]!=nums[correct_index]){
                swap(nums,index,correct_index);
            }else {
                index++;
            }
        }

//        printing the sorted array
        System.out.println(Arrays.toString(nums));

//search for the first missing number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1 ){
                return i+1;
            }
        }



        return nums.length+1;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
