/**
 * https://leetcode.com/problems/third-maximum-number/
 *
 *
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * Example 1:
 * Input: [3, 2, 1]
 *
 * Output: 1
 * Explanation: The third maximum is 1.
 *
 * Example 2:
 * Input: [1, 2]
 *
 * Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 *
 * Example 3:
 * Input: [2, 2, 3, 1]
 *
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */

package _414_ThirdMaximumNumber;

public class Solution
{
    public static void main(String[] args)
    {
        int[] testOne = {3,2,1};
        int[] testTwo = {1,2};
        int[] testThree = {2,2,3,1};

        System.out.println("Solution 1 test 1: " + thirdMax(testOne));
        System.out.println("Solution 1 test 2: " + thirdMax(testTwo));
        System.out.println("Solution 1 test 3: " + thirdMax(testThree));

    }

    public static int thirdMax(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > max)
            {
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i] > secondMax && nums[i] < max)
            {
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            else if(nums[i] > thirdMax  && nums[i] < secondMax)
            {
                thirdMax = nums[i];
            }
        }

        if (thirdMax > Integer.MIN_VALUE)
        {
            return thirdMax;

        }

        return max;
    }
}
