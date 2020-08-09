package _7_ReverseInteger;

/**
 *
 * https://leetcode.com/problems/reverse-integer/
 * 7. Reverse Integer
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 * Input: 123
 * Output: 321
 *
 * Example 2:
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed
 * integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */


public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));


    }

    public static int reverse(int x)
    {

        boolean isXNegative = false;
        if (x < 0)
        {
            isXNegative = true;
            x = Math.abs(x);
        }

        long num = 0;
        int lastDigit = 0;
        while (x > 0)
        {
            lastDigit = x % 10;
            num = num * 10 + lastDigit;
            x /= 10;
        }

        if (isXNegative)
        {
            num *= -1;
        }

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
        {
            return 0;
        }


        return (int) num;
    }
}
