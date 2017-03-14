/**
 * 
 */
package com.bhuwan.datastructure.sorting.insertion;

import com.bhuwan.datastructure.sorting.SortUtils;

/**
 * Using multiple for loops
 * 
 * @author bhuwan
 *
 */
public class InsertionSortV2 {

    public static Comparable[] sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (SortUtils.less(a[j], a[j - 1])) {
                    SortUtils.exch(a, j, j - 1);
                }
            }
        }
        return a;
    }

}
