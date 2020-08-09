package AprilTwelfth_LastStoneWeight;

import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        int[] stoneWeights = {2,7,4,1,8};
//        int[] stoneWeights = {2,2};
        System.out.println(lastStoneWeight(stoneWeights));
    }

//    public static int lastStoneWeight(int[] stones)
//    {
//        PriorityQueue<Integer> pQueue = createPQueue(stones);
//        int max = Integer.MIN_VALUE;
//        while (pQueue.peek() != null)
//        {
//            if(pQueue.size() == 1)
//            {
//                return pQueue.peek();
//            }
//            max = pQueue.poll();
//            int secondMax = Integer.MIN_VALUE;
//            if (pQueue.peek() != null)
//            {
//                secondMax = pQueue.poll();
//                if (max != secondMax)
//                {
//                    int newWeight = calculateWeight(max, secondMax);
//                    pQueue.add(newWeight);
//                }
//            }
//        }
//        if (pQueue.isEmpty())
//        {
//            return 0;
//        }
//
//        return max;
//    }


    /**
     * WAY SIMPLIER SOLUTION
     * */
    public static int lastStoneWeight(int[] stones)
    {
        PriorityQueue<Integer> pQueue = createPQueue(stones);
        while (pQueue.size() != 1)
        {
            int x = pQueue.poll();
            int y = pQueue.poll();
            if (x != y)
            {
                pQueue.add(x - y);
            }
            else
            {
                pQueue.add(0);
            }
        }

        int result = pQueue.poll();
        return result;
    }

    private static int calculateWeight(int max, int secondMax)
    {
        return max - secondMax;
    }

    // Create Priority Queue (Max Heap) from the given array input
    private static PriorityQueue<Integer> createPQueue(int[] stones)
    {
        // Convert primitive array to Integer Object array
        Integer[] stoneWeights = Arrays.stream(stones).boxed().toArray(Integer[]::new);
        PriorityQueue<Integer> pQueue =
                new PriorityQueue<>(Collections.reverseOrder());

        pQueue.addAll(Arrays.asList(stoneWeights));

        return pQueue;
    }
}