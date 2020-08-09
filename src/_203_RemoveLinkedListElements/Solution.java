package _203_RemoveLinkedListElements;

/**
 *https://leetcode.com/problems/remove-linked-list-elements/
 *
 * 203. Remove Linked List Elements


 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */

public class Solution
{
    public static void main(String[] args)
    {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(6);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next.next = new ListNode(6);

        ListNode result = removeElements(node, 6);
        System.out.println(result.val);

    }

    public static ListNode removeElements(ListNode head, int val)
    {
        if (head == null)
        {
            return null;
        }

        while (head.val == val && head.next != null)
        {
            head = head.next;
        }

        ListNode curNode = head;
        while (curNode.next != null)
        {
            if (curNode.next.val == val)
            {
                curNode.next = curNode.next.next;
            }
            else
            {
                curNode = curNode.next;
            }
        }

        return head;
    }
}
