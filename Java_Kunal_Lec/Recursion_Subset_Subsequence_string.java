package com.Java_Kunal_Lec;

import java.util.ArrayList;
import java.util.List;

public class Recursion_Subset_Subsequence_string {
    public static void main(String[] args) {
//        Q1:remove the particular char from the string
//        skip("","baccdah");

//        Q2:Remove the particular char from the string and return to the main
//        System.out.println(skip("baccdah"));

//        Q3:Remove the particular String from the given string and return the main
//        System.out.println(skip_string("bacapplecedh"));

//        Q4:print the subset of the string
//        subseq("","abc");

//        Q5:print the subset and return the new string
//        System.out.println(subseq_return_value("","abc"));

//        Q6:print the subset and return the new string and print the ascii value of the character
//        subseqAscii("","abc");

//        Q7:Print the subsequence using iterative
        int[] arr = {1,2,3,4,5};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans ){
            System.out.println(list);
        }
    }
    public static void skip(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch=='a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }

    public static String skip(String up){
        if (up.isEmpty()){
          return "";
        }
        char ch = up.charAt(0);
        if (ch=='a'){
          return   skip(up.substring(1));
        }else {
           return ch + skip(up.substring(1));
        }
    }

    public static String skip_string(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return   skip_string(up.substring(5));
        }else {
            return up.charAt(0) + skip_string(up.substring(1));
        }
    }

    public static void subseq(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch , up.substring(1));
        subseq(p,up.substring(1));
    }

    public static ArrayList<String> subseq_return_value(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> left =  subseq_return_value(p+ch , up.substring(1));
        ArrayList<String> right =  subseq_return_value(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    public static void subseqAscii(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p+ch , up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }

    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
