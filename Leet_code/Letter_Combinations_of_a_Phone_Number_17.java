package com.Leet_code;

import java.util.ArrayList;

public class Letter_Combinations_of_a_Phone_Number_17 {
    public static void main(String[] args) {

//        pad("","12");

//        System.out.println(padRet("","12"));

        System.out.println(padCount("","12"));

//        System.out.println(letterCombinations("23"));

    }
//    public static List<String> letterCombinations(String digits) {
//
//    }

    public static void pad(String p,String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        int digit = up.charAt(0) - '0';//this will convert '2 into 2

        for (int i = (digit-1) * 3; i < digit*3 ; i++) {

            char ch = (char) ('a' + i);

            pad(p+ch,up.substring(1));

        }
    }

    public static ArrayList<String> padRet(String p ,String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';//this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a'+i);
           list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }

    public static int padCount(String p,String up){
        if (up.isEmpty()){
            return 1 ;
        }

        int count = 0;
        int digit = up.charAt(0) - '0';//this will convert '2 into 2

        for (int i = (digit-1) * 3; i < digit*3 ; i++) {

            char ch = (char) ('a' + i);

           count = count +  padCount(p+ch,up.substring(1));

        }

        return count;
    }

}
