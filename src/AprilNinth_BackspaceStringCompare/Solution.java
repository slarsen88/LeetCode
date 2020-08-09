package AprilNinth_BackspaceStringCompare;

import java.util.Stack;

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(backspaceString("a#b"));
        System.out.println(backspaceString("ab##"));
        System.out.println(backspaceString("a##c"));
        System.out.println(backspaceString("ad#c"));

        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("a#c", "b"));




    }

    public static boolean backspaceCompare(String S, String T)
    {
        return backspaceString(S).equals(backspaceString(T));
    }

//    public static String backspaceString(String S)
//    {
//        String result = "";
//        int numOfBackspaces = 0;
//        Stack<Character> charStack = new Stack<>();
//        for (int i = S.length() - 1; i >= 0; i--)
//        {
//            if (S.charAt(i) == '#')
//            {
//                numOfBackspaces++;
//            }
//            else if (numOfBackspaces == 0)
//            {
//                charStack.push(S.charAt(i));
//            }
//            else
//            {
//                numOfBackspaces--;
//            }
//        }
//
//        while (!charStack.empty())
//        {
//            result += charStack.pop();
//        }
//
//        return result;
//    }

    public static String backspaceString(String S)
    {
        String result = "";
        Stack<Character> charStack = new Stack<>();
        for (int i = 0 ; i < S.length(); i++)
        {
            if (S.charAt(i) != '#')
            {
                charStack.push(S.charAt(i));
            }
            else if (!charStack.empty())
            {
                charStack.pop();
            }
        }

        while (!charStack.empty())
        {
            result += charStack.pop();
        }

        return result;
    }
}
