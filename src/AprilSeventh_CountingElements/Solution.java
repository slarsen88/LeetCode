package AprilSeventh_CountingElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
//        int[] arr = {1,1,3,3,5,5,7,7};
//        int[] arr = {1,3,2,3,5,0};
//        int[] arr = {1,1,2,2};
//        int[] arr = {1,3,2,3,5,0};
//        int[] arr = {2,9,0,7,6,2,7,7,0};
        System.out.println(countElements(arr));
    }

    public static int countElements(int[] arr)
    {
        int count = 0;
        HashMap<Integer, Integer> map = addElementsToMap(arr);
        ArrayList<Integer> sortedKeys = sortKeys(map);
        int j = 0;
        for(int i = 1; i < sortedKeys.size(); i++)
        {
            if (sortedKeys.get(i) == sortedKeys.get(j) + 1)
            {
                count += map.get(sortedKeys.get(j));
                j++;
            } else
            {
                j++;
            }
        }

        return count;
    }

    private static HashMap<Integer, Integer> addElementsToMap(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            int key = arr[i];
            if (!map.containsKey(key))
            {
                map.put(key, 1);
            }
            else
            {
                map.put(key, map.get(key) + 1);
            }
        }

        return map;
    }

    private static ArrayList<Integer> sortKeys(HashMap<Integer, Integer> map)
    {
        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        return sortedKeys;
    }
}
