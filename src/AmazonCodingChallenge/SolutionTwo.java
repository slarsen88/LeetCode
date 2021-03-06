/**
 * Order Delivery Route
 *
 * Delivery area is represented as a 2d grid of integers.
 * Truck must start from the top-left corner which is always accessible and can move
 * one cell up, down, left, or right at a time. The truck must navigate around the areas without rouds and cannot
 * leave the area.
 * The accessible ares are represendted as 1, areas without roads are represented by 0 and order destination is
 * represented by 9
 *
 * INPUT: The input to the function/method consists of one argument: area, representing the 2d grid of integers
 *
 * OUTPUT: Return an integer representing the total distance traversed to deliver the order else return -1
 *
 * Example
 * Input:
 * area=
 * [[1, 0, 0],
 * [1, 0, 0],
 * [1, 9, 1]]
 *
 * Output: 3
 *
 * Explanation:
 * Starting from the top-left corner, the truck traversed the cells (0,0)->(1,0)->(2,0)->(2,1).
 * The truck traversed the total distance to deliver the order. So the output is 3.
 */

package AmazonCodingChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SolutionTwo {
    public static void main(String[] args) {

    }

}
