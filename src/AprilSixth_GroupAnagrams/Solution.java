package AprilSixth_GroupAnagrams;

/*
https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3288/

Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.
 */
import java.util.*;

public class Solution
{
    public static List<List<String>> groupedAnagrams = new ArrayList<>();
    public static void main(String[] args)
    {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupedAnagrams = groupAnagrams(words);
    }

    public static List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String, ArrayList<String>> sortedWordMap = new HashMap<>();
        for (String currentWord: strs)
        {
            String sortedString = sortString(currentWord);
            if (!sortedWordMap.containsKey(sortedString))
            {
                sortedWordMap.put(sortedString, new ArrayList<>());
                sortedWordMap.get(sortedString).add(currentWord);
            }
            else
            {
                ArrayList<String> anagramList = sortedWordMap.get(sortedString);
                anagramList.add(currentWord);
                sortedWordMap.put(sortedString, anagramList);
            }
        }

        for (String key: sortedWordMap.keySet())
        {
            groupedAnagrams.add(sortedWordMap.get(key));
        }

        return groupedAnagrams;
    }

    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
}
