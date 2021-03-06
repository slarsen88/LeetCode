package _204_CountPrimes;

public class Solution
{
    public static void main(String[] args)
    {
//        System.out.println(countPrimes(10));

        int n = 6;
        int count = 0;

        for (int i = 2; i < n; i++) {
            boolean res = checkPrime(i);
            if (res == true)
                count++;
        }
        System.out.println("total prime number till " + n + " is " + count);
    }

    private static boolean checkPrime(int n) {
        if (n == 1)
            return false;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }


//    public static int countPrimes(int n)
//    {
//        int numOfPrimes = 0;
//
//        // outer loop counts from 1 to n
//        for (int i = 1; i <= n; i++)
//        {
//           boolean isPrime = true;
//            // inner loop counts from 2 to i and checks divisibility
//            for (int j = 2; j < i; j++)
//            {
//                if (i % j == 0)
//                {
//                    isPrime = false;
//                }
//
//            }
//
//            if (isPrime)
//            {
//                numOfPrimes++;
//            }
//        }
//
//        return numOfPrimes;
//    }

//    public static int countPrimes(int n) {
//        int numOfPrimes = 0;
//        for (int i = 2; i < n; i++) {
//
//            for (int j = 2; j < n; j++) {
//                boolean isPrime = true;
//                if (i % j == 0) {
//                    isPrime = false;
//                    if (isPrime) {
//                        numOfPrimes++;
//                    }
//                }
//            }
//        }
//
//        return numOfPrimes;
//    }
}
