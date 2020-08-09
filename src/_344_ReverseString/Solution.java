package _344_ReverseString;

/**
 *
 * https://leetcode.com/problems/reverse-string/
 *
 * 344. Reverse String

 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

public class Solution
{
    public static void main(String[] args)
    {
        char[] stringArr = {'h', 'e', 'l', 'l', 'o'};
//        char[] stringArr = {'H', 'a', 'n', 'n', 'a', 'h'};

        reverseString(stringArr);

    }

    public static void reverseString(char[] s)
    {
        int front = 0;
        int back = s.length - 1;

        while (front < back && front != back)
        {
            char temp = s[back];
            s[back] = s[front];
            s[front] = temp;
            back--;
            front++;
        }
    }

}
