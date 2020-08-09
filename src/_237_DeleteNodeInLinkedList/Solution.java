
package _237_DeleteNodeInLinkedList;

/**
 *
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 *
 *
 * 237. Delete Node in a Linked List
 *
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 * Given linked list -- head = [4,5,1,9], which looks like following:
 *
 *
 *
 *
 *
 * Example 1:
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 *
 * Example 2:
 * Input: head = [4,5,1,9], node = 1
 * Output: [4,5,9]
 * Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
 *
 *
 * Note:
 * The linked list will have at least two elements.
 * All of the nodes' values will be unique.
 * The given node will not be the tail and it will always be a valid node of the linked list.
 * Do not return anything from your function.
 */


public class Solution
{
    public static ListNode head = new ListNode(4);
    public static void main(String[] args)
    {

        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
//        deleteNode(head.next);
        deleteNodeNoHead(head.next);

    }

    // This is the solution if you were given the head of the list
    public static void deleteNode(ListNode node)
    {
        System.out.println(head.val);
        System.out.println(node.val);

        ListNode next = head;
        ListNode prev = null;

        while (next != node)
        {
            prev = next;
            next = next.next;
        }

        prev.next = next.next;
    }

    // This is the solution if you were only given a node
    public static void deleteNodeNoHead(ListNode node)
    {
        // Copy the value of node's next
        node.val = node.next.val;

        // point node's next to node.next.next
        node.next = node.next.next;
    }

}
