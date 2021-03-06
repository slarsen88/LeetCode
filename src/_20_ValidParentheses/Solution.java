package _20_ValidParentheses;

/*
https://leetcode.com/problems/valid-parentheses/
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true
 */

import java.util.HashMap;
import java.util.Stack;

public class Solution
{
    public static HashMap<Character, Character> rightFacing = new HashMap<>();
    public static void main(String[] args)
    {
        rightFacing.put(')', '(');
        rightFacing.put(']','[');
        rightFacing.put('}','{');
        System.out.println(isValid("(("));
        System.out.println(isValid("()"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }

        if (s.length() == 0) {
            return true;
        }
        Stack<Character> leftFacing = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            char curChar = s.charAt(i);
            if (!rightFacing.containsKey(curChar))
            {
                leftFacing.push(curChar);
            }
            else
            {
                char topChar = leftFacing.pop();
                if (rightFacing.get(curChar) != topChar)
                {
                    return false;
                }
            }
        }

        return true;





















//        for (int i = 0; i < s.length(); i++){
//            char currentChar = s.charAt(i);
//           if (rightFacing.containsKey((currentChar)))
//           {
//               char top = leftFacing.empty() ? '#' : leftFacing.pop();
//
//               if (top != rightFacing.get(currentChar))
//               {
//                   return false;
//               }
//           }
//           else
//           {
//               leftFacing.push(currentChar);
//           }
//        }

//        return leftFacing.empty();
    }
}
