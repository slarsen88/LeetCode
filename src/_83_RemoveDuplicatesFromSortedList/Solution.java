package _83_RemoveDuplicatesFromSortedList;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * 83. Remove Duplicates from Sorted List
 * Easy
 *
 * 2002
 *
 * 133
 *
 * Add to List
 *
 * Share
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 *
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3

 **/

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode newList = deleteDuplicates(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode pSlow = head;
        ListNode pFast = head;

        if (head == null) {
            return null;
        }

        while (pFast != null) {
            if (pSlow.val == pFast.val && pFast.next == null) {
                pSlow.next = pFast.next;
                return head;
            }
            else if (pSlow.val == pFast.val) {
                pFast = pFast.next;
            } else {
                pSlow.next = pFast;
                pSlow = pFast;
                pFast = pFast.next;
            }
        }

        return head;
    }
}
