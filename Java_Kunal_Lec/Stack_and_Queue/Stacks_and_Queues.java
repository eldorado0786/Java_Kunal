package com.Java_Kunal_Lec.Stack_and_Queue;

import java.util.*;

public class Stacks_and_Queues {
    public static void main(String[] args) {
        /* Stack */

//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(stack.pop());
//        }

        /* Queues */
//
//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(9);
//        queue.add(1);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(queue.remove());
//        }

        /* Deque  */

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(21);
        deque.removeFirst();


    }
}
