/**
 * 
 */
package com.bhuwan.algorithm.recursion;

/**
 * @author bhuwan
 *
 */
public class Fibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println("fibonacci of " + i + " is: " + fib(i));
    }

}
