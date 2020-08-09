package AprilTenth_MinStack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3292/
 *   Min Stack
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example: *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */

public class MinStack
{
//    private ArrayList<Integer> stack;
//    private ArrayList<Integer> minValue;

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
//    public MinStack() {
//       stack = new ArrayList<>();
//       minValue = new ArrayList<>();
//
//    }
//
//    public void push(int x) {
//        if (stack.isEmpty())
//        {
//            minValue.add(x);
//            stack.add(x);
//        }
//        else if (minValue.get(minValue.size() - 1) > x)
//        {
//            minValue.add(x);
//            stack.add(x);
//        }
//        else if(minValue.get(minValue.size() - 1) == x)
//        {
//            minValue.add(x);
//            stack.add(x);
//        }
//        else
//        {
//            stack.add(x);
//        }
//    }
//
//    public void pop() {
//        System.out.println("stack top = " + stack.get(stack.size() - 1));
//        System.out.println("minStack top = " + minValue.get(minValue.size() - 1));
//
//        if (stack.get(stack.size() - 1) > minValue.get(minValue.size() - 1))
//        {
//            stack.remove(stack.size() - 1);
//        }
//        else if (stack.get(stack.size() - 1) == minValue.get(minValue.size() - 1))
//        {
//            stack.remove(stack.size() - 1);
//            minValue.remove(minValue.size() - 1);
//        }
//    }
//
//    public int top() {
//        return stack.get(stack.size() - 1);
//    }
//
//    public int getMin() {
//        return minValue.get(minValue.size() - 1);
//    }

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        }
        else if (x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int topStack = stack.peek();
        int topMinStack = minStack.peek();
       if (topStack == topMinStack) {
           minStack.pop();
       }
       stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

