package _215_KthLargestElementInArray;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 *
 * 215. Kth Largest Element in an Array
 *
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Example 1:
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 *
 * Example 2:
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 *
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */

public class Solution
{
    public static void main(String[] args)
    {
        int[] input1 = {3,2,1,5,6,4};
        System.out.println(findKthLargest(input1, 1));

        int[] input2 = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(input2, 4));

    }

    public static int findKthLargest(int[] nums, int k)
    {
        // Solution 1 sorting O(n logn)
//        Arrays.sort(nums);
//        return nums[nums.length - k];


        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            minHeap.add(i);
            if (minHeap.size() > k)
            {
                minHeap.remove();
            }
        }

        return minHeap.remove();
    }
}
