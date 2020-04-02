/**
 *
        https://leetcode.com/problems/contains-duplicate/

        Given an array of integers, find if the array contains any duplicates.

        Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

        Example 1:

        Input: [1,2,3,1]
        Output: true
        Example 2:

        Input: [1,2,3,4]
        Output: false
        Example 3:

        Input: [1,1,1,3,3,4,3,2,4,2]
        Output: true

 */

package _217_ContainsDuplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        int[] testOne = {1,2,3,1};
        int[] testTwo = {1,2,3,4};
        int[] testThree = {1,1,1,3,3,4,3,2,4,2};
        int[] testFour = {};


        // Tests for solution 1
//        System.out.println("Solution 1 test 1: " + containsDuplicateHashMap(testOne));
//        System.out.println("Solution 1 test 2: " + containsDuplicateHashMap(testTwo));
//        System.out.println("Solution 1 test 3: " + containsDuplicateHashMap(testThree));
//        System.out.println("Solution 1 test 4: " + containsDuplicateHashMap(testFour));

        // Tests for solution 2
//        System.out.println("Solution 2 test 1: " + containsDuplicateSortedArray(testOne));
//        System.out.println("Solution 2 test 2: " + containsDuplicateSortedArray(testTwo));
//        System.out.println("Solution 2 test 3: " + containsDuplicateSortedArray(testThree));
//        System.out.println("Solution 2 test 4: " + containsDuplicateSortedArray(testFour));

        // Tests for solution 3
        System.out.println("Solution 3 test 1: " + containsDuplicatesSet(testOne));
        System.out.println("Solution 3 test 2: " + containsDuplicatesSet(testTwo));
        System.out.println("Solution 3 test 3: " + containsDuplicatesSet(testThree));
        System.out.println("Solution 3 test 4: " + containsDuplicatesSet(testFour));

    }

    /**
     *
     * Solution one:
     * iterates over the array and adds the values to a hash map and increases the value
     * for each time that key is seen in the array.
     *
     * Iterate over the HashMap and return true if any of the values for the keys is > 1. Else, return false.
     */
    public static boolean containsDuplicateHashMap(int[] nums)
    {
        // Initial check to see if the Array is empty
        if (nums.length == 0)
        {
            return false;
        }

        HashMap<Integer, Integer> numOfOccurrences = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (!numOfOccurrences.containsKey(nums[i]))
            {
                numOfOccurrences.put(nums[i], 1);
            }
            else
            {
                int currentValue = numOfOccurrences.get(nums[i]);
                numOfOccurrences.put(nums[i], ++currentValue);
            }
        }

        for (Integer key : numOfOccurrences.keySet())
        {
            if (numOfOccurrences.get(key) >1)
            {
                return true;
            }
        }

        return false;
    }

    /**
     *
     * Solution two:
     * Sort the Array
     * Iterate over the array and compare adjacent elements. If they are the same, return true, else return false.
     */
    public static boolean containsDuplicateSortedArray(int[] nums)
    {
        // Sort the array
        Arrays.sort(nums);

        // Iterate over the array
        for (int i = 0; i < nums.length - 1; i++)
        {
            // Compare adjacent elements and look for matches
            if (nums[i] == nums[i + 1])
            {
                return true;
            }
        }

        return false;
    }


    /**
     *
     * Solution three:
     * Iterate through the array and add the elements to a set.
     * If the value already exists in the set, return true. If you loop through the entire array and find no duplicates,
     * return false.
     */
    public static boolean containsDuplicatesSet(int[] nums)
    {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            {
                return true;
            }
        }

        return false;
    }


}
