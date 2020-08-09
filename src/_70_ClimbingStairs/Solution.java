package _70_ClimbingStairs;

/**
 *
 * https://leetcode.com/problems/climbing-stairs/
 *
 * 70. Climbing Stairs

 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Example 2:
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(climbStairs(5));
    }

//    public static int climbStairs(int n)
//    {
//        if (n == 1)
//        {
//            return 1;
//        }
//
//        if (n == 2)
//        {
//            return 2;
//        }
//
//        return climbStairs(n-1) + climbStairs(n-2);
//    }

    // Dynamic Programming
    public static int climbStairs(int n)
    {
        if (n == 1)
        {
            return 1;
        }

        if (n == 2)
        {
            return 2;
        }

        int[] results = new int[n];
        results[0] = 1;
        results[1] = 2;
        for (int i = 2; i < n; i++)
        {
            results[i] = results[i-1] + results[i-2];
        }

        return results[n-1];
    }
}
