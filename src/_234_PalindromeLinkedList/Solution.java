package _234_PalindromeLinkedList;

import java.util.List;
import java.util.Stack;

/**
 * 234. Palindrome Linked List
 *
 * https://leetcode.com/problems/palindrome-linked-list/

 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 * Input: 1->2
 * Output: false
 *
 * Example 2:
 * Input: 1->2->2->1
 * Output: true
 *
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */

public class Solution
{
    public static void main(String[] args)
    {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(node));
    }

    public static boolean isPalindrome(ListNode head)
    {

        Stack<Integer> reversedStack = new Stack<>();
        ListNode originalHead = head;

        while (head != null)
        {
            reversedStack.push(head.val);
            head = head.next;
        }

        while (!reversedStack.isEmpty())
        {
            if (reversedStack.peek() != originalHead.val)
            {
                return false;
            }

            reversedStack.pop();
            originalHead = originalHead.next;
        }

        return true;
    }
}
