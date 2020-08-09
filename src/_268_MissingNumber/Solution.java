package _268_MissingNumber;

/**
 *
 * https://leetcode.com/problems/missing-number/
 *
 * 268. Missing Number
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 * Input: [3,0,1]
 * Output: 2
 *
 * Example 2:
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 *
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */

public class Solution
{
    public static void main(String[] args)
    {
        int[] testArr = {3,0,1};
//        int[] testArr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(testArr));
    }

    public static int missingNumber(int[] nums)
    {
        int missingVal = 0;
        // Create a new array with a size 1 larger than input array.
        // This will store a value of 1 at each index of the corresponding ith value of input array
        // if the number is found in the input array
        int[] missingNumArr = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++)
        {
            missingNumArr[nums[i]] = 1;
        }

        // Loop over missingNumArr and look for the value of '0' if found, return the index.
        for (int i = 0; i < missingNumArr.length; i++)
        {
            if (missingNumArr[i] == 0)
            {
                missingVal = i;
            }
        }

        return missingVal;
    }
}
