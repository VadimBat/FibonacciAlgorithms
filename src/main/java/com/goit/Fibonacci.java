package com.goit;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Long> memo = new HashMap<>();
    private static String errorMessage = "Entered incorrect number";

    //Complexity O(n)
    public static long fibonacciIterate(int n) {
        if (n < 0){
            throw new IllegalArgumentException(errorMessage);
        }
        if (n <= 1) {
            return n;
        }
        long n0 = 0;
        long n1 = 1;
        for (int i = 2; i <= n; i++) {
            long next = n0 + n1;
            n0 = n1;
            n1 = next;
        }
        return n1;
    }

    //Complexity O(2^n)
    public static long fibonacciRecurse(int n) {
        if (n < 0){
            throw new IllegalArgumentException(errorMessage);
        }
        if (n <= 1) {
            return n;
        }
        return fibonacciRecurse(n - 1) + fibonacciRecurse(n - 2);
    }

    //Complexity O(n)
    public static long fibonacciDynamic(int n) {
        if (n < 0){
            throw new IllegalArgumentException(errorMessage);
        }
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long fib = fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2);
        memo.put(n, fib);
        return fib;
    }
}
