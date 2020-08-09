package _1356_SortIntegersByNumberofOneBits;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 *
 * 1356. Sort Integers by The Number of 1 Bits

 * Given an integer array arr. You have to sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
 *
 * Return the sorted array.
 *
 *
 *
 * Example 1:
 * Input: arr = [0,1,2,3,4,5,6,7,8]
 * Output: [0,1,2,4,8,3,5,6,7]
 * Explantion: [0] is the only integer with 0 bits.
 * [1,2,4,8] all have 1 bit.
 * [3,5,6] have 2 bits.
 * [7] has 3 bits.
 * The sorted array by bits is [0,1,2,4,8,3,5,6,7]
 *
 * Example 2:*
 * Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
 * Output: [1,2,4,8,16,32,64,128,256,512,1024]
 * Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
 *
 * Example 3:
 * Input: arr = [10000,10000]
 * Output: [10000,10000]
 *
 * Example 4:
 * Input: arr = [2,3,5,7,11,13,17,19]
 * Output: [2,3,5,17,7,11,13,19]
 *
 * Example 5:
 * Input: arr = [10,100,1000,10000]
 * Output: [10,100,10000,1000]
 */

public class Solution
{
    public static void main(String[] args)
    {
        int[] testArr = {0,1,2,3};
        int[] result = sortByBits(testArr);
    }

    public static int[] sortByBits(int[] arr)
    {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> listofVals = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            int numOfOnes = calculateBinaryOnes(arr[i]);
            if (!map.containsKey(numOfOnes))
            {
                map.put(numOfOnes, new ArrayList<>(i));
            }
            else
            {
                listofVals = map.get(numOfOnes);
                listofVals.add(i);
                map.put(numOfOnes, listofVals);
            }
        }

        return arr;

    }

    private static int calculateBinaryOnes(int x)
    {
        String s = Integer.toBinaryString(x);
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '1')
            {
                count++;
            }
        }

        return count;
    }
}
