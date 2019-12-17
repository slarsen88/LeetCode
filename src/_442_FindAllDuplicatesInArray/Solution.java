/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements that appear twice in this array.
 *
 * Could you do it without extra space and in O(n) runtime?
 */


package _442_FindAllDuplicatesInArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        List output = findDuplicates(input);
        System.out.println(output);
    }

    public static List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> duplicates = new ArrayList<>();

        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (!counts.containsKey(nums[i]))
            {
                counts.put(nums[i], 1);
            }
            else
            {
                int curValue = counts.get(nums[i]);
                counts.put(nums[i], ++curValue);
            }
        }

        for (int key : counts.keySet())
        {
            if (counts.get(key) > 1)
            {
                duplicates.add(key);
            }
        }

        return duplicates;
    }
}
