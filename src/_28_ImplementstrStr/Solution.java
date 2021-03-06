package _28_ImplementstrStr;

/**
 * https://leetcode.com/problems/implement-strstr/
 *
 *
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 *
 *
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * Example 3:
 * Input: haystack = "", needle = ""
 * Output: 0
 */

public class Solution
{
    public static void main(String[] args)
    {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));

        String haystack1 = "mississippi";
        String haystack2 = "issip";
        System.out.println(strStr(haystack1, haystack2));
    }

    public static int strStr(String haystack, String needle)
    {
        if (needle.length() == 0)
        {
            return 0;
        }

        if (haystack.length() == 0)
        {
            return -1;
        }

        int needlePointer = 0;
        int firstOccurrence = -1;

        for (int i = 0; i < haystack.length(); i++)
        {
            if (haystack.charAt(i) == needle.charAt(needlePointer))
            {
                if (firstOccurrence == -1)
                {
                    firstOccurrence = i;
                }

                if (needlePointer == needle.length() - 1)
                {
                    return firstOccurrence;
                }
                needlePointer++;
            }
            else
            {
                needlePointer = 0;
                firstOccurrence = -1;
            }
        }


        return -1;
    }
}
