/**
 * 
 */
package com.bhuwan.datastructure.sorting;

/**
 * @author bhuwan
 *
 */
public class SortUtils {

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static boolean isArraySorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (SortUtils.less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
