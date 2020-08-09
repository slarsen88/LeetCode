package _1380_LuckyNumbersInMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 * 1380. Lucky Numbers in a Matrix
 *
 * Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 *
 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 *
 *
 *
 * Example 1: *
 * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * Output: [15]
 * Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
 *
 * Example 2: *
 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * Output: [12]
 * Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
 *
 * Example 3: *
 * Input: matrix = [[7,8],[1,2]]
 * Output: [7]
 */

public class Solution
{
    public static void main(String[] args)
    {
//        int[][] testMatrix = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] testMatrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        List<Integer> result = luckyNumbers((testMatrix));
        for (Integer x: result)
        {
            System.out.println(x);
        }
    }


    public static List<Integer> luckyNumbers (int[][] matrix)
    {
        int[] rowMins = new int[matrix.length];
        int[] colMaxs = new int[matrix[0].length];

        List<Integer> luckyNums = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (rowMins[i] == 0 || (rowMins[i] > matrix[i][j]))
                {
                    rowMins[i] = matrix[i][j];
                }

                if (colMaxs[j] < matrix[i][j])
                {
                    colMaxs[j] = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix[i][j] == rowMins[i] && matrix[i][j] == colMaxs[j])
                {
                    luckyNums.add(matrix[i][j]);
                }
            }
        }

        return luckyNums;
    }

//    public static List<Integer> luckyNumbers (int[][] matrix)
//    {
//        List<Integer> rowMins = new ArrayList<>();
//        List<Integer> colMaxs = new ArrayList<>();
//        List<Integer> luckyNums = new ArrayList<>();
//
//        rowMins = findAllRowMins(matrix);
//        colMaxs = findAllColMax(matrix);
//
//        luckyNums = findMatchesInList(rowMins, colMaxs);
//
//        return luckyNums;
//    }
//
////    private static List<Integer> findMatchesInList(List<Integer> rowMins, List<Integer> colMaxs)
////    {
////        List<Integer> matches = new ArrayList<>();
////
////        for (Integer valueInRowMin: rowMins)
////        {
////            if (colMaxs.contains(valueInRowMin))
////            {
////                matches.add(valueInRowMin);
////            }
////        }
////
////        return matches;
////    }
////
////    private static List<Integer> findAllRowMins(int[][] matrix)
////    {
////        int numOfRows = matrix.length;
////        int numOfColumns = matrix[0].length;
////        List<Integer> rowMins = new ArrayList<>();
////        for (int i = 0; i < numOfRows; i++)
////        {
////            int min = matrix[i][0];
////            for (int j = 0; j < numOfColumns; j++)
////            {
////                int curValue = matrix[i][j];
////                if (curValue < min)
////                {
////                    min = curValue;
////                }
////            }
////            rowMins.add(min);
////        }
////
////        return rowMins;
////    }
////
////    private static List<Integer> findAllColMax(int[][] matrix)
////    {
////        List<Integer> colMax = new ArrayList<>();
////
////        int numOfRows = matrix.length;
////        int numOfColumns = matrix[0].length;
////
////        for (int col = 0; col < numOfColumns; col++)
////        {
////            int max = matrix[0][col];
////            for (int row = 0; row < numOfRows; row++)
////            {
////                int curValue = matrix[row][col];
////                if (curValue > max)
////                {
////                    max = curValue;
////                }
////            }
////
////            colMax.add(max);
////        }
////        return colMax;
////    }
}
