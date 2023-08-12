package com.Java_Kunal_Question;

public class Palindrome {
    public static void main(String[] args) {
//        Checking if the string is palindrome or not
        String str = "";
        System.out.println(isPlaindrome(str));
    }
    public static boolean isPlaindrome(String str){
        if (str==null||str.length()==0){
            return true;
        }
       str =  str.toLowerCase();
        for (int i = 0; i <= str.length() /2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start!=end){
                return false;
            }
        }
        return true;
    }
}
