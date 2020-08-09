package AprilThirteenth_ContiguousArray;

import java.util.HashMap;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3298/
 *
 * Contiguous Array
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 *
 * Example 1:
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 *
 * Example 2:
 * Input: [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 *
 * Note: The length of the given binary array will not exceed 50,000.
 */

public class Solution
{

    public static void main(String[] args)
    {
//        int[] input = {0,1};
        int[] input = {0,1,1,0,0,0};

        System.out.println(findMaxLength(input));
    }

    // Brute force, breaks Leetcode
//    public static int findMaxLength(int[] nums)
//    {
//        int maxLength = 0;
//        for (int i = 0; i < nums.length; i++)
//        {
//            int count = 0;
//            for (int j = i; j < nums.length; j++)
//            {
//                if (nums[j] == 0)
//                {
//                    count--;
//                }
//                else
//                {
//                    count++;
//                }
//
//                if (count == 0) {
//                    maxLength = Math.max(maxLength, j - i + 1);
//                }
//            }
//        }
//
//        return maxLength;
//    }

    public static int findMaxLength(int[] nums)
    {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int maxLength = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                count--;
            }
            else
            {
                count++;
            }

            if (count == 0)
            {
                System.out.println(i);
            }
        }

        return maxLength;
    }
}
