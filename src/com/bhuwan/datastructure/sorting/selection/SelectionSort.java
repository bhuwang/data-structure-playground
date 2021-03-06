/**
 * 
 */
package com.bhuwan.datastructure.sorting.selection;

import com.bhuwan.datastructure.sorting.SortUtils;

/**
 * <pre>
 * Selection sort always compares to its right to find the minimum even if the array is 
 * already sorted.
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class SelectionSort {

    public static Comparable[] sort(Comparable[] array) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (SortUtils.less(array[j], array[min])) {
                    min = j;
                }
            }
            SortUtils.exch(array, i, min);
        }
        return array;
    }
}
