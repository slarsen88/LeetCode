package _204_CountPrimes;

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n)
    {
        int numOfPrimes = 0;

        // outer loop counts from 1 to n
        for (int i = 1; i <= n; i++)
        {
           boolean isPrime = true;
            // inner loop counts from 1 to i and checks divisibility
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                }

            }

            if (isPrime)
            {
                numOfPrimes++;
            }
        }

        return numOfPrimes;
    }
}
