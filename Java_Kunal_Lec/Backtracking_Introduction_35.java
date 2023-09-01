package com.Java_Kunal_Lec;

import java.util.ArrayList;
import java.util.Arrays;

public class Backtracking_Introduction_35 {
    public static void main(String[] args) {
//        Q1:Maze Problem
//        System.out.println(count(3,3));
//        Q2:print the actual path of the maze
//        path("",3,3);
//        Q3:Return the actual path of the Maze
//        System.out.println(pathRet("",3,3));
        // Q4:Return the actual path of the maze when you can go diagonally
//        System.out.println(pathRetDaigonal("",3,3));

//        Q5:print the actual path when there is the obstacle
//        boolean[][] board = {
//                {true,true,true},
//                {true,false,true},
//                {true,true,true},
//        };
//        pathRestriction("",board,0,0);

//        Q6:Print the all the path of the maze using backtracking
//        boolean[][] board = {
//                {true,true,true},
//                {true,true,true},
//                {true,true,true},
//        };
//        AllPath("",board,0,0);

//        Q7:Print the matrix of the allpath
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] path = new int[board.length][board[0].length];
        AllPathMatrix("",board,0,0,path,1);
    }

    public static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;

    }

    public static void path(String p,int r,int c){
        if (r==1&&c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p+'D',r-1,c);
        }
        if (c>1){
            path(p+'R',r,c-1);
        }
    }

    public static ArrayList<String> pathRet(String p, int r, int c){
        if (r==1&&c==1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1){
           list.addAll( pathRet(p+'D',r-1,c));
        }
        if (c>1){
           list.addAll( pathRet(p+'R',r,c-1));
        }
        return list;
    }
    public static ArrayList<String> pathRetDaigonal(String p, int r, int c){
        if (r==1&&c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1&&c>1){
            list.addAll( pathRetDaigonal(p+'D',r-1,c-1));
        }
        if (r>1){
            list.addAll( pathRetDaigonal(p+'V',r-1,c));
        }
        if (c>1){
            list.addAll( pathRetDaigonal (p+'H',r,c-1));
        }
        return list;
    }

    public static void pathRestriction(String p,boolean[][] maze,int r,int c){
        if (r== maze.length-1&& c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r<maze.length-1){
            pathRestriction(p+'D',maze,r+1,c);
        }
        if (c<maze[0].length-1){
            pathRestriction(p+'R',maze,r,c+1);
        }
    }

    public static void AllPath(String p,boolean[][] maze,int r,int c){
        if (r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

//        i am considering this block in my ath
        maze[r][c] = false;

        if (r<maze.length-1){
            AllPath(p+'D',maze,r+1,c);
        }
        if (c<maze[0].length-1){
            AllPath(p+'R',maze,r,c+1);
        }
        if (r>0){
            AllPath(p+'U',maze,r-1,c);
        }
        if (c>0){
            AllPath(p+'L',maze,r,c-1);
        }
//        this line is where the function will be over
//        so before the function gets removed,also removed the changes that were made by that function
        maze[r][c] = true;
    }

    public static void AllPathMatrix(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if (r==maze.length-1&&c==maze[0].length-1){
            path[r][c] = step;
           for (int[] arr:path){

               System.out.println(Arrays.toString(arr));
           }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

//        i am considering this block in my ath
        maze[r][c] = false;

        path[r][c] = step;
        if (r<maze.length-1){
            AllPathMatrix(p+'D',maze,r+1,c,path,step+1);
        }
        if (c<maze[0].length-1){
            AllPathMatrix(p+'R',maze,r,c+1 , path,step+1);
        }
        if (r>0){
            AllPathMatrix(p+'U',maze,r-1,c,path,step+1);
        }
        if (c>0){
            AllPathMatrix(p+'L',maze,r,c-1,path,step+1);
        }
//        this line is where the function will be over
//        so before the function gets removed,also removed the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}