package _141_LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 *
 * 141. Linked List Cycle

 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *
 *
 *
 * Example 1: *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *
 *
 * Example 2: *
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 *
 *
 * Example 3: *
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 */

public class Solution
{
    public static void main(String[] args)
    {
        ListNode node = new ListNode(3);
        node.next = new ListNode(2);
        node.next.next = new ListNode(0);
        node.next.next.next = new ListNode(-4);
        node.next.next.next.next = node.next;

        System.out.println(hasCycleTwoPointers(node));
    }

    // Using two pointers

    public static boolean hasCycleTwoPointers(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast)
        {
            if (fast == null || fast.next == null)
            {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;

        }

        return true;

    }

    public static boolean hasCycle(ListNode head)
    {
        if (head == null)
        {
            return false;
        }

        Set<ListNode> nodeSet = new HashSet<>();

        ListNode curNode = head;
        while (curNode != null)
        {
            if (!nodeSet.contains(curNode))
            {
                nodeSet.add(curNode);
                curNode = curNode.next;
            }
            else
            {
                return true;
            }
        }

        return false;
    }
}
