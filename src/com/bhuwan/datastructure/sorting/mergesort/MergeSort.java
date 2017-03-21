/**
 * 
 */
package com.bhuwan.datastructure.sorting.mergesort;

import com.bhuwan.datastructure.sorting.SortUtils;

/**
 * @author bhuwan
 *
 */
public class MergeSort {

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // precondition: a[lo...mid] sorted
        assert (SortUtils.isArraySorted(a, lo, mid));

        // precondition: a[mid+1...high] sorted
        assert (SortUtils.isArraySorted(a, mid + 1, hi));

        // copy all the elements from a to aux
        for (int k = 0; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;

        // merge the sorted subarrays to auxillary array.
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (SortUtils.less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
        // postcondition: a[lo...high] sorted
        assert (SortUtils.isArraySorted(a, mid + 1, hi));
    }

    public static void sort(Comparable[] a, Comparable aux[], int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        Comparable aux[] = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }
}
