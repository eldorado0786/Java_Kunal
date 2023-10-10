package com.Java_Kunal_Lec.linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public  LL() {
        this.size=0;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.val;
        tail=secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if (index==0){
          return   deleteFirst();
        }
        if (index==size-1){
          return   deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
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

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insert(int val,int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }
    private class Node{
      private int val;
       private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

//    Inserting using the recursion after the index
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if (index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;

    }

//    Leet code question 83
    public void duplicates(){
        Node node = head ;
        while (node.next!=null){
            if (node.val==node.next.val){
                node.next=node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
// Leet code Question 21
    public static LL merge(LL first,LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while (f!=null&&s!=null){
            if (f.val<s.val){
                ans.insertLast(f.val);
                f=f.next;
            }else {
                ans.insertLast(s.val);
                s=s.next;
            }
        }
        while (f!=null){
            ans.insertLast(f.val);
            f=f.next;
        }
        while (s!=null){
            ans.insertLast((s.val));
            s=s.next;
        }
        return ans;
    }
    public static void main(String[] args) {
//        LL list = new LL();
//        Leet Code Question 83
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(5);
//        list.insertLast(5);
//        list.display();
//        list.duplicates();
//        list.display();

//        Leet Code Question 21

        LL first = new LL();
//        LL second = new LL();
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//        second.insertLast(14);
//        LL ans = LL.merge(first,second);
//        ans.display();
    }
}
