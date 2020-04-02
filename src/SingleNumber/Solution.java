package SingleNumber;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
 */


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution
{

    public static void main(String[] args) {

        int[] num1 = { 2, 2, 1 };
        int[] num2 = { 4, 1, 2, 1, 2 };

        System.out.println(singleNumberSet(num1));
        System.out.println(singleNumberSet(num2));

    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> uniqueVals = new HashMap();
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!uniqueVals.containsKey(nums[i])) {
                uniqueVals.put(nums[i], 1);
            } else {
                int currentQty = uniqueVals.get(nums[i]);
                uniqueVals.put(nums[i], ++currentQty);
            }
        }

        for (int i : uniqueVals.keySet()) {
            if (uniqueVals.get(i) == 1) {
                unique = i;
            }
        }

        return unique;
    }

    public static int singleNumberSet(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (!set.contains(element)) {
                set.add(element);
            } else {
                set.remove(element);
            }
        }

        Integer first = set.iterator().next();

        return first;
    }

}
