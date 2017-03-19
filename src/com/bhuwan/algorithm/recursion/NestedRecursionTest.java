/**
 * 
 */
package com.bhuwan.algorithm.recursion;

/**
 * @author bhuwan
 *
 */
public class NestedRecursionTest {

    public static void rec(int n) {
        if (n <= 0) {
            n = 0;
            return;
        }

        System.out.print(n);

        rec(n - 1);
        System.out.print("---");
        System.out.print(n);
        rec(n - 1);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        NestedRecursionTest.rec(4);
    }

}
