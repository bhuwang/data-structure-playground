/**
 * 
 */
package com.bhuwan.datastructure.sorting.quicksort;

import com.bhuwan.datastructure.sorting.SortUtils;
import com.bhuwan.datastructure.sorting.shuffle.KnuthShuffle;

/**
 * @author bhuwan
 *
 */
public class QuickSort {

    public static void sort(Comparable[] a) {
        // shuffle needed for performance guarantee
        KnuthShuffle.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            // step 1: find the left swap element
            while (SortUtils.less(a[++i], a[lo]))
                if (i == hi)
                    break;
            // step 2: find the right swap element
            while (SortUtils.less(a[lo], a[--j]))
                if (j == lo)
                    break;
            // step 3: termination condition: Check if the pointer crossed
            if (i >= j)
                break;
            // step 4: swap elements
            SortUtils.exch(a, i, j);
        }
        // step 5: swap the partitioning item
        SortUtils.exch(a, lo, j);
        // return index of item known to be in place
        return j;
    }

}
