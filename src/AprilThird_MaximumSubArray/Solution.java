package AprilThird_MaximumSubArray;

/*
https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3285/

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class Solution
{
    public static void main(String[] args)
    {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {-2, 1, 2};
//        int[] nums = {1,2};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int subMax = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++){
                subMax += nums[j];
                if (max < subMax) {
                    max = subMax;
                }
            }
            subMax = 0;
        }

        return max;
    }

}
