package com.Java_Kunal_Lec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Introduction_to_Array_and_Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Syntax of the array
//        datatype[] variable_name = new datatype[size];



//        Q1:creating the array when the size is known
//        int[] arr = new int[5];
//        arr[0]=1;
//        arr[1]=3;
//        arr[2]=4;
//        arr[3]=6;
//        arr[4]=7;


//        Q2:inputting the array when the size is not know
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        displaying the array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        displaying all the array at once
//        System.out.println(Arrays.toString(arr));



//    Q3:2-d array
//        System.out.println("2-D array ");
//        System.out.println("Enter the number for the 2-D array ");
//         int[][] arr = new int[3][3];
//        for (int row = 0; row < arr.length ; row++) {
//            for (int col = 0; col < arr[row].length ; col++) {
//                arr[row][col]=input.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//        Q4:Input array when the size is not known using the ArrayList

        ArrayList <Integer> list = new ArrayList<>(10);//initial capacity is ignored if it reaches the limit

        list.add(61);
        list.add(6);
        list.add(1);
        list.add(4);
        System.out.println(list.contains(6));
        System.out.println(list);
        list.set(2,100);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
