/**
 * 
 */
package com.bhuwan.datastructure.sorting.insertion;

import com.bhuwan.datastructure.sorting.SortUtils;

/**
 * Using for and while loops
 * 
 * @author bhuwan
 *
 */
public class InsertionSort {

    public static Comparable[] sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            while (SortUtils.less(a[i], a[i - 1])) {
                SortUtils.exch(a, i, i - 1);
                if (i > 1) {
                    i--;
                }
            }
        }
        return a;
    }
}
