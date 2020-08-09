package _1394_LuckyIntInArray;

/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 * 1394. Find Lucky Integer in an Array
 *
 * Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.
 * Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.
 *
 *
 *
 * Example 1: *
 * Input: arr = [2,2,3,4]
 * Output: 2
 * Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
 *
 * Example 2: *
 * Input: arr = [1,2,2,3,3,3]
 * Output: 3
 * Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
 *
 * Example 3: *
 * Input: arr = [2,2,2,3,3]
 * Output: -1
 * Explanation: There are no lucky numbers in the array.
 *
 * Example 4: *
 * Input: arr = [5]
 * Output: -1
 *
 * Example 5:
 * Input: arr = [7,7,7,7,7,7,7]
 * Output: 7
 */

public class Solution
{
    public static void main(String[] args)
    {
        int[] testNums = {2,2,3,4};
//        int[] testNums = {1,2,2,3,3,3};
//        int[] testNums = {2,2,2,3,3};
//        int[] testNums = {5};
//        int[] testNums = {7,7,7,7,7,7,7};


        System.out.println(findLucky(testNums));
    }

    public static int findLucky(int[] arr)
    {
        int[] numsCount = new int[500];

        for (int i = 0; i < arr.length; i++)
        {
            int curCount = numsCount[arr[i]];
            numsCount[arr[i]] = ++curCount;
        }

        int greatestLuckyNum = -1;
        for (int i = 1; i < numsCount.length; i++)
        {
            if (i == numsCount[i])
            {
                int luckyNum = i;

                if (greatestLuckyNum < luckyNum)
                {
                    greatestLuckyNum = luckyNum;
                }
            }
        }

        return greatestLuckyNum;
    }
}
