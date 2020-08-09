package _242_ValidAnagram;

/**
 *
 * https://leetcode.com/problems/valid-anagram/
 *
 * 242. Valid Anagram

 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

public class Solution
{
    public static void main(String[] args)
    {
        boolean result = isAnagram("anagram", "nagaram");
        System.out.println(result);

        boolean test2 = isAnagram("rat", "car");
        System.out.println(test2);
    }

    public static boolean isAnagram(String s, String t)
    {

        int[] charCounts = new int[255];

        for (int i = 0; i < s.length(); i++)
        {
           charCounts[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++)
        {
            charCounts[t.charAt(i)]--;
        }

        for (int i = 0; i < charCounts.length; i++)
        {
            if (charCounts[i] != 0)
            {
                return false;
            }
        }

        return true;
    }
}
