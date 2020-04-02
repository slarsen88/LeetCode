/**
 * https://leetcode.com/problems/number-of-islands/
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water
 * and is formed by connecting adjacent lands horizontially or vertically. You may assume all four edges of the grid
 * are all surrounded by water.
 *
 * Example 1:
 *
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * Output: 1
 *
 *
 * Example 2:
 *
 * Input:
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * Output: 3
 */

package _200_NumberOfIslands;

public class Solution
{
    public static void main(String[] args)
    {
        char[][] islands = {{'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};

        System.out.println(numIslands(islands));


    }

    public static int numIslands(char[][] grid)
    {
        int count = 0;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                if (grid[i][j] == '1')
                {
                    traverseNeighbors(grid, i, j);
                    count++;
                }
            }

        }

        return count;
    }

    private static void traverseNeighbors(char[][] grid, int i, int j)
    {
        if(i < 0 || i >= grid.length)
        {
            return;
        }
        else if(j < 0 || j >= grid[i].length)
        {
            return;
        }
        else if  (grid[i][j] == '0')
        {
            return;
        }

        grid[i][j] = '0';

        traverseNeighbors(grid, ++i, j); // Checks i's neighbor below
        traverseNeighbors(grid, --i, j); // Checks i's neighbor above
        traverseNeighbors(grid, i, --j); // Checks i's left neighbor
        traverseNeighbors(grid, i, ++j); // Checks i's right neighbor
//
//        traverseNeighbors(grid, i+1, j); // Checks i's neighbor below
//        traverseNeighbors(grid, i-1, j); // Checks i's neighbor above
//        traverseNeighbors(grid, i, j-1); // Checks i's left neighbor
//        traverseNeighbors(grid, i, j+1); // Checks i's right neighbor
    }
}
