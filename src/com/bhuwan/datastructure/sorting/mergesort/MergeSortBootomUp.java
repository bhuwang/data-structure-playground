/**
 * 
 */
package com.bhuwan.datastructure.sorting.mergesort;

import com.bhuwan.datastructure.sorting.SortUtils;

/**
 * @author bhuwan
 *
 */
public class MergeSortBootomUp {

    // This class should not be instantiated.
    private MergeSortBootomUp() {
    }

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        int n = a.length;
        Comparable[] aux = new Comparable[n];
        for (int len = 1; len < n; len *= 2) {
            for (int lo = 0; lo < n - len; lo += len + len) {
                int mid = lo + len - 1;
                int hi = Math.min(lo + len + len - 1, n - 1);
                MergeSort.merge(a, aux, lo, mid, hi);
            }
        }
        assert SortUtils.isArraySorted(a);
    }

    // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
