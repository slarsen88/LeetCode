package _206_ReverseLinkedList;

import java.util.List;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * 206. Reverse Linked List
 *
 * Reverse a singly linked list.
 *
 * Example: *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 * Follow up: *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * Definition for singly-linked list.
 *      * public class ListNode {
 *      *     int val;
 *      *     ListNode next;
 *      *     ListNode() {}
 *      *     ListNode(int val) { this.val = val; }
 *      *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *      * }
 */


public class Solution
{
    public static void main(String[] args)
    {
        ListNode listNode1= new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        listNode1.next.next.next.next = new ListNode(5);

        ListNode newHead = reverseList(listNode1);
        System.out.println(newHead.val);

    }

    // Iterative Approach
//    public static ListNode reverseList(ListNode head)
//    {
//        ListNode curNode = head;
//
//        ListNode prev = null;
//
//        while (curNode != null)
//        {
//            ListNode nextNode = curNode.next;
//            curNode.next = prev;
//            prev = curNode;
//            curNode = nextNode;
//        }
//
//        return prev;
//    }

    // Recursive approach
    public static ListNode reverseList(ListNode head)
    {
       if (head.next == null)
       {
           return head;
       }

        ListNode p = reverseList(head.next);
        ListNode nextNode = head.next;
        nextNode.next = head;
        head.next = null;
        return p;
    }

}
