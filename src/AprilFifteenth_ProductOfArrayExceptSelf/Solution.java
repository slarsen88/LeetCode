package AprilFifteenth_ProductOfArrayExceptSelf;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/
 * Product of Array Except Self
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
 *
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */


public class Solution
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};
       int[] solution = productExceptSelf(nums);
        for (int product: solution )
        {
            System.out.print(product + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums)
    {
        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            int product = 0;
            for (int j = 0; j < nums.length; j++)
            {
                if (j != i)
                {
                    product *= nums[j];
                    product = nums[j];
                }
            }
            products[i] = product;
        }

        return products;
    }
}
