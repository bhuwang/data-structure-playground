/**
 * 
 */
package com.bhuwan.datastructure.sorting.quicksort;

import java.util.Arrays;

/**
 * @author bhuwan
 *
 */
public class QuickSortTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Comparable[] arrayToBeSort = new Comparable[] { 5, 6, 9, 32, 45, 67, 77, 2, 4, 8, 11, 23, 45, 67, 89 };
        // Comparable[] arrayToBeSort = new Comparable[] { 11, 6, 9, 89, 67, 23, 45 };
        // Comparable[] arrayToBeSort = new Comparable[] { 11, 6, 9, 89, 67, 23, 45 };
        Comparable[] arrayToBeSort = new Comparable[] { 88, 67, 23, 45, 12 };
        System.out.println("Original array: " + Arrays.toString(arrayToBeSort));
        QuickSort.sort(arrayToBeSort);
        System.out.println("Sorted Array: " + Arrays.toString(arrayToBeSort));
    }

}
