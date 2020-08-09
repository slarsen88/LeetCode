package _1365_HowManyNumbersSmallerThanCurrentNumber;

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
//        int[] testArr = {8,1,2,2,3};
        int[] testArr = {6,5,4,8};
//        int[] testArr = {7,7,7,7};


        int[] result = smallerNumbersThanCurrent(testArr);
        for (int x: result)
        {
            System.out.println(x);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums)
    {
        int[] countSmaller = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            int curValue = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++)
            {
                if (curValue > nums[j])
                {
                    count++;
                }
            }
            countSmaller[i] = count;
        }

        return countSmaller;
    }
//    public static int[] smallerNumbersThanCurrent(int[] nums)
//    {
//        int[] countSmaller = new int[nums.length];
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++)
//        {
//            if (i == 0)
//            {
//                countSmaller[i] = 0;
//            }
//            else if (nums[i] != nums[i-1])
//            {
//                countSmaller[i] = i;
//            }
//            else
//            {
//                countSmaller[i] = countSmaller[i - 1];
//            }
//        }
//
//        return countSmaller;
//    }
}
