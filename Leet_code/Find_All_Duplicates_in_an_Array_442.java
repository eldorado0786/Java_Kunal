package com.Leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
    public static List<Integer> findDuplicates(int[] nums) {

        int index = 0 ;

        while (index< nums.length){
            int correct_index = nums[index]-1;
            if (nums[index]!=nums[correct_index]){
                swap(nums,index,correct_index);
            }else{
                index++;
            }
        }

//        printing the array
        System.out.println(Arrays.toString(nums));

        List<Integer> ans = new ArrayList<Integer>();
//        finding all the duplicates from the given array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
