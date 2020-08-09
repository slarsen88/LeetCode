package _88_MergeSortedArray;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * 88. Merge Sorted Array

 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3 *
 * Output: [1,2,2,3,5,6]
 */

public class Solution
{
    public static void main(String[] args)
    {
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2, 5, 6};
//        int m = 3;
//        int n = 3;

//        int[] nums1 = {0};
//        int[] nums2 = {1};
//        int m = 1;
//        int n = 1;

        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int num1P = m - 1;
        int num2P = n - 1;
        int length = nums1.length - 1;

        while (num1P >= 0 && num2P >= 0)
        {
            if (nums1[num1P] > nums2[num2P])
            {
                nums1[length] = nums1[num1P];
                num1P--;
            }
            else
            {
                nums1[length] = nums2[num2P];
                num2P--;
            }

            length--;
        }

        while (num2P >= 0)
        {
            nums1[length] = nums2[num2P];
            num2P--;
            length--;
        }

//        for (int i = nums1.length - 1; i >= 0; i--)
//        {
//            if (num2P < 0)
//            {
//                return;
//            }
//
//            if (nums1[num1P] > nums2[num2P])
//            {
//                nums1[i] = nums1[num1P];
//                num1P--;
//            }
//            else
//            {
//                nums1[i] = nums2[num2P];
//                num2P--;
//            }
//        }
    }
}
