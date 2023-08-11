package com.Leet_code;

import java.util.Arrays;

public class Set_Mismatch_645 {
    public static void main(String[] args) {
        int[] arrs = {1,2,2,4};
        int[] ans = findErrorNums(arrs);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums) {
        int index = 0 ;
        while (index< nums.length){
            int correct_index = nums[index]-1;
            if (nums[index]!=nums[correct_index]){
                swap(nums,index,correct_index);
            }else {
                index++;
            }
        }
//        printing the sorted array through cyclic sort algorithm
        System.out.println(Arrays.toString(nums));

//        finding the duplicate number and the number which is lost

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
              return new int[] {nums[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
