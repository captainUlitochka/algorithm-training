package com.company;

public class FibonacciRecurrent {

    public static long compute(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {

            return compute(n-1) + compute(n-2);

        }
    }

    public void test() {

    }
}
