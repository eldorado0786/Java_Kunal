package com.Leet_code;

import java.util.Arrays;

public class Missing_Number_268 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
       int ans =   missingNumber(arr);
        System.out.println("Answer -> "+ ans);

    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correct_index = nums[i];
            if(nums[i]< nums.length&& nums[i]!=nums [correct_index]) {
                swap(nums, i, correct_index);
            }else {
                i++;
            }

        }
//        Searching for the first missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j){
                return j;
            }
        }
//        case 2
        return nums.length;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
