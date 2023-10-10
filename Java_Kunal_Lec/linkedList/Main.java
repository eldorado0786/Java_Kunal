package com.Java_Kunal_Lec.linkedList;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        /* code for the Singly linked list  */
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(10);
        list.display();
//        list.insertLast(1);
//        list.display();
//        list.insert(100,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
        list.insertRec(88,2);
        list.display();

        /* Code for the Doubly linked list  */
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.display();
//        list.displayRev();
//        list.insertLast(19);
//        System.out.println();
//        list.display();
//        list.insert(8,65);
//        list.display();

        /* Code for the Circular Linked list */
//        CLL list = new CLL();
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//        list.display();
//        list.delete(20);
//        System.out.println();
//        list.display();
    }
}
