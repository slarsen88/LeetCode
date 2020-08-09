package _66_PlusOne;

/**
 * https://leetcode.com/problems/plus-one/
 *
 * 66. Plus One

 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */

public class Solution
{
    public static void main(String[] args)
    {
//        int[] testArr = {1,2,3};
//        int[] testArr = {4,3,2,1};
        int[] testArr = {9};
//        int[] testArr = {9,8,7,6,5,4,3,2,1,0};

        int[] result = plusOne(testArr);
        for (int num:result)
        {
            System.out.print(num + " ");
        }
    }

    public static int[] plusOne(int[] digits)
    {
        // Start at the end of the array
        for (int i = digits.length - 1; i >= 0; i--)
        {
            // If the number is less than 9, add 1 to it and return the array
            if (digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }

            // If the number is 9, make it 0 and continue to check the next value (in reverse)
            digits[i] = 0;
        }

        // Case where all numbers in the array were original 9's and changed to 0s
        // [9,9] => [0,0] => [1,0,0]
        if (digits[0] == 0)
        {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }

//    public static int[] plusOne(int[] digits)
//    {
//        String result = "";
//        for (int i = 0; i < digits.length; i++)
//        {
//            result += digits[i];
//        }
//
//        int resultValue = Integer.parseInt(result);
//        resultValue++;
//        String resultValueString = Integer.toString(resultValue);
//        int stringLength = resultValueString.length();
//
//        int[] resultArray = new int[stringLength];
//        for (int i = stringLength - 1; i >= 0; i--)
//        {
//            int lastDigit = resultValue % 10;
//            resultArray[i] = lastDigit;
//            resultValue /= 10;
//        }
//
//        return resultArray;
//    }

}
