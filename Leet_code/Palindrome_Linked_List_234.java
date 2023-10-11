package com.Leet_code;

public class Palindrome_Linked_List_234 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public boolean isPalindrome(ListNode head) {
            ListNode mid = middleNode(head);
            ListNode headSecond = reverseList(mid);

            // Compare both the halves
            while (head != null && headSecond != null) {
                if (head.val != headSecond.val) {
                    return false;
                }
                head = head.next;
                headSecond = headSecond.next;
            }
            return true;
        }

        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
        }


}
