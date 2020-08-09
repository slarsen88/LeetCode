package _27_RemoveElement;

/**
 * https://leetcode.com/problems/remove-element/
 *
 * 27. Remove Element

 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * Example 1: *
 * Given nums = [3,2,2,3], val = 3, *
 * Your function should return length = 2, with the first two elements of nums being 2. *
 * It doesn't matter what you leave beyond the returned length.
 *
 * Example 2: *
 * Given nums = [0,1,2,2,3,0,4,2], val = 2, *
 * Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 * *
 * Note that the order of those five elements can be arbitrary.
 *
 * It doesn't matter what values are set beyond the returned length.
 *
 */

public class Solution
{
    public static void main(String[] args)
    {
        int nums[] = {2,3,3,2};
        System.out.println(removeElement(nums, 2));
    }


    public static int removeElement(int[] nums, int val)
    {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++)
        {
            if (nums[fast] != val)
            {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }

    // More confusing solution below:
//    public static int removeElement(int[] nums, int val)
//    {
//        int numOfOccurrencesOfVal = 0;
//        int newArrayLength = nums.length;
//        for (int i = 0; i < nums.length; i++)
//        {
//            if (nums[i] == val)
//            {
//                numOfOccurrencesOfVal++;
//            }
//        }
//
//        if (numOfOccurrencesOfVal == 0)
//        {
//            return newArrayLength;
//        }
//
//        newArrayLength = nums.length - numOfOccurrencesOfVal;
//
//        int pointer = 0;
//
//        for (int i = 0; i < newArrayLength; i++)
//        {
//            while (pointer < nums.length && nums[pointer] == val)
//            {
//                pointer++;
//            }
//
//            nums[i] = nums[pointer];
//            pointer++;
//        }
//
//        return newArrayLength;
//    }
}