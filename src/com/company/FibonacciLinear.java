package com.company;

public class FibonacciLinear {

    public static long compute(int n) {
        long result;
        long sum = 0;
        long prev1 = 1;
        long prev2 = 1;

        if (n == 1 || n == 2) {
            result = 1;
        } else {
            for (int i = 3; i <= n; i++) {
                sum = prev1 + prev2;
                prev2 = prev1;
                prev1 = sum;
            } result = sum;
        }
        return result;
    }
}
