package com.Java_Kunal_Lec;
import java.util.Arrays;

public class Binary_search_in_2_d_arrya {
    //    Optimize Binary Search
    public static void main(String[] args) {
// Q1:Binary search in the 2d array when the row and column is in the sorted manner
//        int[][] arr = {
//                {10,20,30,40},
//                {15,25,35,45},
//                {28,29,37,49},
//                {33,34,38,50}
//        };
//       int[] ans = search(arr,37);
//        System.out.println(Arrays.toString(ans));
//        Q2:Binary search in a sorted matrix
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(sorted_seaech(arr,9 )));
    }

    public static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return  new int[] {-1,-1};
    }
    public static int[] sorted_seaech(int[][] martrix,int target){
        int row = martrix.length;
        int column = martrix[0].length;
        if (row==1){
            return binary_search(martrix,0,0,column-1,target);
        }
//        run the loop till two rows are reamining
        int rStart= 0;
        int rEnd = row-1;
        int cMid = column/2;
        while (rStart<(rEnd-1)){
//            while this is true it will have more than two rows
            int mid = rStart+(rEnd-rStart)/2;
            if (martrix[mid][cMid]==target){
                return new int[] {mid,cMid};
            }
            if (martrix[mid][cMid]<target){
                rStart = mid;
            }else {
                rEnd = mid;
            }

        }
        //now we have two rows
//        check whether the target is in the col of 2 rows
        if (martrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if (martrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
//        search in the 1st half
        if (target <= martrix[rStart][cMid - 1]) {
            return binary_search(martrix,rStart,0,cMid-1,target);
        }

//        search in the 2nd half
        if (target >= martrix[rStart][cMid + 1] && target <= martrix[rStart][column-1]) {
            return binary_search(martrix,rStart,cMid+1,column-1,target);
        }
//        search in the 3rd half
        if (target <= martrix[rStart + 1][cMid - 1]) {
            return binary_search(martrix,rStart+1,0,cMid-1,target);
        }else {
            return binary_search(martrix,rStart+1,cMid+1,column-1,target);
        }
//        search in the 4th half




    }
    public static int[] binary_search(int[][] martrix , int row ,int cStart,int cEnd,int target){
        while (cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if (martrix[row][mid]==target){
                return new int[] {row,mid};
            }
            if (martrix[row][mid]<target){
                cStart = mid+1;
            }else {
                cEnd =mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}
