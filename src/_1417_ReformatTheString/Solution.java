package _1417_ReformatTheString;

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
       System.out.println(reformat("ab123"));
    }

    public static String reformat(String s)
    {
        ArrayList<Character> letterArr = new ArrayList<>();
        ArrayList<Character> numArr = new ArrayList<>();
        int letterCount = 0;
        int numCount = 0;
        String reformattedString = "";
        for (int i = 0; i < s.length(); i++)
        {
            char currentChar = s.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z')
            {
                letterCount++;
                letterArr.add(currentChar);
            }
            else
            {
                numCount++;
                numArr.add(currentChar);
            }
        }

        if (letterCount == numCount || (Math.abs(letterCount - numCount) == 1))
        {
            int loopCounter = 0;
            Boolean isLetterArrLonger = false;
            Character lastChar;
            if (letterArr.size() < numArr.size())
            {
                loopCounter = letterArr.size();
            }
            else
            {
                loopCounter = numArr.size();
                isLetterArrLonger = true;
            }

            for (int i = 0; i < loopCounter; i++)
            {
                if (isLetterArrLonger)
                {
                    reformattedString += letterArr.get(i);
                    reformattedString += numArr.get(i);
                }
                else
                {
                    reformattedString += numArr.get(i);
                    reformattedString += letterArr.get(i);
                }
            }

            if (letterCount == numCount)
            {
                return reformattedString;
            }

            if (isLetterArrLonger)
            {
                lastChar = letterArr.get(letterArr.size() - 1);
            }
            else
            {
                lastChar = numArr.get(numArr.size() - 1);

            }

            reformattedString += lastChar;
        }

        return reformattedString;
    }
}
