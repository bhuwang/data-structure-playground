/**
 * 
 */
package com.bhuwan.datastructure.sorting.insertion;

import com.bhuwan.datastructure.sorting.SortUtils;

/**
 * <pre>
 * fast unless array size is huge
 * tiny, fixed footprint for code(used in embedded systems)
 * hardware sort prototype
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class ShellSort {

    public static Comparable[] sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
            System.out.println("h - value: " + h);
            // 3x + 1 increment sequence
            // 1, 4, 13, 40, 121,...
        }
        while (h >= 1) {
            // h-sort array
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && SortUtils.less(a[j], a[j - h]); j -= h) {
                    SortUtils.exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
        return a;
    }
}
