package com.Java_Kunal_Lec;

import java.util.ArrayList;

public class Recursion_Permutation_33 {
    public static void main(String[] args) {
//        Q1:Print the permutation of the abc string
//        permutation("","abc");

//        Q2:Print the permutation of the abc string and return the ans in the arraylist format
        ArrayList<String> ans = permutationlist("","abc");
        System.out.println(ans);
    }
    public static void permutation (String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
             String s = p.substring(i,p.length());
             permutation(f+ch+s,up.substring(1));
        }
    }

    public static ArrayList<String> permutationlist (String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           ans.addAll( permutationlist(f+ch+s,up.substring(1)));
        }

        return ans;
    }
}
