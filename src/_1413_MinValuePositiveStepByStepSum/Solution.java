package _1413_MinValuePositiveStepByStepSum;

public class Solution
{
    public static void main(String[] args)
    {
        int[] testArr = {1,2};
        System.out.println(minStartValue(testArr));
    }

    public static int minStartValue(int[] nums)
    {
        int i = 0;
        int sum;
        boolean isMinStartValue = false;
        while (!isMinStartValue)
        {
            boolean foundMinValue = true;
            i++;
            sum = i;
            for (int j = 0; j < nums.length; j++)
            {
                sum += nums[j];
                if (sum < 1)
                {
                    foundMinValue = false;
                    break;
                }
            }

            if (foundMinValue)
            {
                isMinStartValue = true;
            }

        }

        return i;
    }
}
