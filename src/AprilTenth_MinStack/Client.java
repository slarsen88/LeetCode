package AprilTenth_MinStack;

import java.util.ArrayList;
import java.util.Arrays;

public class Client
{
    public static void main(String[] args)
    {

        MinStack obj = new MinStack();
//        obj.push(1);
//        System.out.println(obj.getMin());
//        obj.push(0);
//        obj.push(-3);
//        System.out.println(obj.getMin());
//        obj.pop();
//        obj.push(-5);
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());

    }
}
