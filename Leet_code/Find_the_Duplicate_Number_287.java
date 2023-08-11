package com.Leet_code;

public class Find_the_Duplicate_Number_287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println("Answer -> "+ans);
    }
    public static int findDuplicate(int[] nums) {
        int ans = 0 ;
//        Cyclic Sort
        int index = 0;
        while (index< nums.length){
            int correct_index = nums[index]-1;
            if (nums[index]!=nums[correct_index]){
                swap(nums,index,correct_index);
            }else {
                index++;
            }
        }

//        printing the cyclic sort

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

//        finding the number which is duplicate
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
               ans = nums[i];
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
