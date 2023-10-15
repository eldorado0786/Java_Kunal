package com.Java_Kunal_Lec.Stack_and_Queue;

public class StackMain {
    public static void main(String[] args) throws StackException {

        /* CustomStack */

//        CustomStack stack = new CustomStack(5);
//        stack.push(34);
//        stack.push(4);
//        stack.push(24);
//        stack.push(14);
//        stack.push(74);
//        stack.push(84);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());//for printing the exception in the terminal

        /* DynamicStack  */
        DynamicStack stack = new DynamicStack( 5 );
        stack.push(34);
        stack.push(4);
        stack.push(24);
        stack.push(14);
        stack.push(74);
        stack.push(84);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
         System.out.println(stack.pop());

//         55:39 min
    }
}
