package _169_MajorityElement;

import java.util.HashMap;

/**
 *https://leetcode.com/problems/majority-element/
 *
 * 169. Majority Element
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears
 * more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class Solution
{
    public static void main(String[] args)
    {
//        int[] testArr = {3,2,3};
        int[] testArr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(testArr));

    }

    public static int majorityElement(int[] nums)
    {
        int majorityElement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            else
            {
                int curCount = map.get(nums[i]);
                map.put(nums[i], ++curCount);
            }
        }

        for (Integer key: map.keySet())
        {
            if (map.get(key) > nums.length / 2)
            {
                majorityElement = key;
            }
        }

        return majorityElement;
    }
}
