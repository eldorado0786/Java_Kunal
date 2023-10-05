package com.Java_Kunal_Lec.linkedList;

public class DLL {
    /* Global variable */
    private Node head;
    private Node tail;

    /* Node class structure */
    private class Node {
        int val;
        Node prev;
        Node next;

        /*This is the constructor run when there is no node in the list*/
        public Node(int val) {
            this.val = val;
        }

        /*This is the constructor which run when there is at least one node is present in the list  */
        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    /* Creating the function for inserting the data in the first place */
    public void insertFirst(int val) {
        //creating the node
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        /* checking for the condition if the list is empty or not  */
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    /* Creating the function to insert the element in the last place  */
    public void insertLast(int val) {
//        Creating the node
        Node node = new Node(val);
        node.next = null;
        /* Checking the condition when the head is empty */
        if (head == null) {
            System.out.println("List is empty");
            head = node;
            node.prev = null;
        } else {
            Node item = head;
//            Checking the node is the last or not for the inserting it in the last position
            while (item.next != null) {
                item = item.next;
            }
            item.next = node;
            node.prev = item;
        }
    }

    /* creating the function to print the list of node */
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    /* Creating the function to print the list in the reverse */
    public void displayRev() {
        Node node = head;
        Node last = null;
        while (node != null) {
//            System.out.print(node.val+" -> ");
            last = node;
            node = node.next;
        }
        System.out.print("END <-");

        while (last != null) {
            System.out.print(last.val + " <- ");
            last = last.prev;
        }
        System.out.print("START");
    }

    /* Creating the function to insert the node after the particular node */
    public void insert (int after,int val){
        Node p = find_the_node_which_has_the_value(after);
        if (p==null){
            System.out.println("does not exists");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p ;
        if (node.next!=null){
            node.next.prev = node;
        }
    }
    public Node find_the_node_which_has_the_value(int val){
        Node node = head;
        while (node!=null){
            if (node.val==val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
