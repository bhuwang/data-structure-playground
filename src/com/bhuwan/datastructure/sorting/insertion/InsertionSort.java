/**
 * 
 */
package com.bhuwan.datastructure.sorting.insertion;

import com.bhuwan.datastructure.sorting.SortUtils;

/**
 * Using for and while loops
 * 
 * <pre>
 * if the array is in reversed order, then it performs less than of selection sort.
 * if the array is in almost sorted order then it performs better than of selection sort.
 * 
 * In general insertion sort is twice fast as selection sort.
 * </pre>
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
