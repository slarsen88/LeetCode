package _21_MergeTwoSortedLists;

import java.util.List;

/**
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * 21. Merge Two Sorted Lists
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

public class Solution
{
    public static void main(String[] args)
    {
        ListNode l1= new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);


        ListNode headOfMergedList = mergeTwoLists(l1, l2);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null && l2 == null)
        {
            return null;
        }

        if (l1 == null)
        {
            return l2;
        }

        if (l2 == null)
        {
            return l1;
        }

        ListNode sortedHead = new ListNode(0);
        ListNode cur = sortedHead;

        while (l1 != null && l2 != null)
        {
            if (l1.val <= l2.val)
            {
                cur.next = l1;
                l1 = l1.next;
            }
            else
            {
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;
        }

        if (l1 != null)
        {
            cur.next = l1;
        }

        if (l2 != null)
        {
            cur.next = l2;
        }

        return sortedHead.next;
    }
}
