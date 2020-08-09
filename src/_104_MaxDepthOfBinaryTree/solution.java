package _104_MaxDepthOfBinaryTree;

import java.util.*;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * 104. Maximum Depth of Binary Tree
 *
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its depth = 3.
 */

public class solution
{
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        TreeNode newRoot = null;

        System.out.println(maxDepth(root));

    }

    // Breadth First Search
//    public static int maxDepth(TreeNode root)
//    {
//
//        if (root == null)
//        {
//            return 0;
//        }
//
//        int maxDepth = 0;
//        Queue<TreeNode> treeQueue = new LinkedList<>();
//        treeQueue.add(root);
//        while (!treeQueue.isEmpty())
//        {
//            int queueSize = treeQueue.size();
//            while (queueSize != 0){
//                TreeNode curNode = treeQueue.poll();
//                queueSize--;
//                if (curNode.left != null)
//                {
//                    treeQueue.add(curNode.left);
//                }
//                if (curNode.right != null)
//                {
//                    treeQueue.add(curNode.right);
//                }
//            }
//            maxDepth++;
//        }
//
//        return maxDepth;
//    }


    // Depth first Search using a stack
    public static int maxDepth(TreeNode root)
    {
        Stack<TreeNode> treeStack = new Stack<>();
        int maxDepth = 0;

        TreeNode cur = root;
        treeStack.push(cur);
        while (cur != null || !treeStack.isEmpty())
        {
            while (cur != null)
            {
                treeStack.push(cur);
                cur = cur.left;
            }

            cur = treeStack.pop();
            System.out.println(cur.val);
            cur = cur.right;
        }

        return maxDepth;
    }
}
