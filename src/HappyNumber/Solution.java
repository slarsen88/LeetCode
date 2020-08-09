package HappyNumber;

/*
https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3284/

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isHappy(14));
        System.out.println(isHappy(19));

    }

    public static boolean isHappy(int n) {
        Set<Integer> valueInCycle = new HashSet<>();
        while (n != 1) {
            if (!valueInCycle.contains(n)) {
                valueInCycle.add(n);
                n = sumSquaresDigits(n);
            } else {
                return false;
            }
        }
        return true;
    }

    public static int sumSquaresDigits(int num){
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            digit *=  digit;
            num /= 10;
            sum += digit;
        }
        return sum;
    }
}
