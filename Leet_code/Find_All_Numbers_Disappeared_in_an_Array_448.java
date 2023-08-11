package com.Leet_code;

import java.lang.reflect.Array;
import java.util.*;

public class Find_All_Numbers_Disappeared_in_an_Array_448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int index = 0;
//        sorting the number according to the array index
        while (index<nums.length){
            int correct_index = nums[index]-1;
            if (nums[index]!=nums[correct_index]){
                swap(nums,index,correct_index);
            }else {
                index++;
            }
        }

//        creating the array list
        List<Integer> ans = new ArrayList<>();

//        printing the number which are missing in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
              ans.add(i+1);
            }
        }
       return ans;
    }
    public static void swap(int[] nums , int first,int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
