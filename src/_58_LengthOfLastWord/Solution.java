package _58_LengthOfLastWord;

/**
 * https://leetcode.com/problems/length-of-last-word/
 *
 * 58. Length of Last Word
 * Easy
 *
 * 857
 *
 * 2856
 *
 * Add to List
 *
 * Share
 * Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 *
 *
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 *
 * Example 2:
 * Input: s = " "
 * Output: 0
 *
 *
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 */

public class Solution {

    public static void main(String[] args) {
        String s = "Hello World";
        String b = "";
        String c = " ";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(b));
        System.out.println(lengthOfLastWord(c));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        if (s.length() == 0) {
            return length;
        }

        if (s == null) {
            return 0;
        }

        if (s.equals(" ")) {
            return length;
        }

        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }


        return words[words.length - 1].length();
    }
}
