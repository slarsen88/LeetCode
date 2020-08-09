package _1408_StringMatchingInArray;

import java.util.ArrayList;
import java.util.List;

public class Solution
{

    public static void main(String[] args)
    {
//        String[] testArr = {"mass","as","hero","superhero"};
//        String[] testArr = {"leetcode","et","code"};
        String[] testArr = {"blue","green","bu"};

        List<String> solution = stringMatching(testArr);

        for (String word: solution)
        {
            System.out.println(word);
        }
    }

    public static List<String> stringMatching(String[] words)
    {
        List<String> subStrings = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            for (int j = 0; j < words.length; j++)
            {
                if (j == i)
                {
                    continue;
                }

                String curWord = words[j];
                if (curWord.contains(word))
                {
                    subStrings.add(word);
                    break;
                }
            }
        }

        return subStrings;
    }
}
