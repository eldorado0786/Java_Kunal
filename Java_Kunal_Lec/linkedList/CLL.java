package com.Java_Kunal_Lec.linkedList;

public class CLL {
    /* Global variable  */
    private Node head;
    private Node tail;

    /* Creating constructor for the global variable */
    public CLL() {
        this.head = null;
        this.tail = null;
    }

    /* Creating the CLL class */
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    /* Creating the function to insert the node in the circular linked list */
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    /* Creating the function to print the list */
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
            System.out.print("END");
        }
    }

    /* Creating the function to delete the node from the list  */

    public void delete(int val){
        Node node = head;
        if (node==null){
            return;
        }
        if (node.val==val){
            head = head.next;
            tail.next = head;
        }
        do {
            Node n = node.next;
            if (n.val==val){
                node.next =n.next;
                break;
            }
            node = node.next;
        }while (node!=head);
    }
}
