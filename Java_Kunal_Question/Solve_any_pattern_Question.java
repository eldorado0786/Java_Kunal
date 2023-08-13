package com.Java_Kunal_Question;

public class Solve_any_pattern_Question {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5 );
        pattern5_one(5);
        pattern17(5);
        pattern28(5);
        pattern30(5);
        pattern31(4);
    }

    public static void pattern1(int n){
        System.out.println("Patter 1");
        for (int row = 0; row < n; row++) {
//             for every row , run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern2(int n){
        System.out.println("Patter 2");
        for (int row = 0; row <n; row++) {
//             for every row , run the col
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern3(int n){
        System.out.println("Patter 3");
        for (int row = 1; row <= n; row++) {
//             for every row , run the col
            for (int col = 1; col <= n - row +1; col++) {
                System.out.print("* ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern4(int n){
        System.out.println("Patter 4");
        for (int row = 1; row <= n; row++) {
//             for every row , run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern5(int n){
        System.out.println("Patter 5");
        int c = 1;
        for (int row = 0; row <= n; row++) {
//             for every row , run the col
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            if (row<n/2){
                c++;
            }else {
                c--;
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern5_one(int n){
        System.out.println("Patter 5.1");

        for (int row = 0; row <  2* n; row++) {
            int c = row > n ? 2 * n - row : row;
//             for every row , run the col
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern17(int n){
        System.out.println("Patter 17");

        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }
//             for every row , run the col
            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col+" ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern28(int n){
        System.out.println("Patter 28");

        for (int row = 0; row <  2 * n; row++) {
            int c = row > n ? 2 * n - row : row;

            int s = n-c;
            for (int space = 0; space < s ; space++) {
                System.out.print(" ");
            }

//             for every row , run the col
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern30(int n){
        System.out.println("Patter 30");

        for (int row = 1; row <=  n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
//             for every row , run the col
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern31(int n){
        System.out.println("Patter 31");
        int originalIndex = n ;
        n = 2 * n ;
        for (int row = 0 ; row <= n ; row++) {

            for (int col = 0; col <= n; col++) {
              int ateveryIdex = originalIndex -  Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print (ateveryIdex+" ");
            }
//             when one row is printed, we need to add a newline
            System.out.println();
        }
    }

}
