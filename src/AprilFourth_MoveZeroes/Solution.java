package AprilFourth_MoveZeroes;
/*
https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Example:
Input: [1,0,3,12]
Output: [1,3,12,0]

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

public class Solution
{
    public static void main(String[] args)
    {
//        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {0,0,1};
//        int[] nums = {0,0};
        int[] nums = {1,0,0};
//        moveZeroesTwo(nums);
        moveZeroesThree(nums);
    }

    // This solution works when there is ONE '0'
    public static void moveZeroes(int[] nums)
    {
        for(int i = 0; i < nums.length - 1; i++)
        {
            int front = nums[i];
            int back = nums[i+1];
            if (front == 0 && back != 0)
            {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

        for (int num:nums)
        {
            System.out.println(num);
        }
    }


    // Works but it's super slow and ugly as heck to read
    public static void moveZeroesTwo(int[] nums)
    {
        if (nums.length == 1)
        {
            return;
        }

        if (nums.length == 2 && nums[0] == 0 && nums[1] == 0)
        {
            return;
        }

        for(int i = 0; i < nums.length - 1; i++)
        {
            int j = i + 1;

            int front = nums[i];
            while (front == 0 && nums[j] == 0 && j < nums.length - 1)
            {
                j++;
            }

            if (front == 0 && nums[j] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (j == nums.length - 1)
            {
                break;
            }
        }

        for (int num:nums)
        {
            System.out.println(num);
        }
    }

    // Best solution
    public static void moveZeroesThree(int[] nums)
    {
        int j = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for (int num:nums)
        {
            System.out.println(num);
        }
    }
}
