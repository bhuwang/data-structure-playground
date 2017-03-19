/**
 * 
 */
package com.bhuwan.datastructure.sorting.merge;

import java.util.Arrays;

/**
 * @author bhuwan
 *
 */
public class TestMergeSortBottomUp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Comparable[] arrayToBeSort = new Comparable[] { 5, 6, 9, 32, 45, 67, 77, 2, 4, 8, 11, 23, 45, 67, 89 };
        // Comparable[] arrayToBeSort = new Comparable[] { 11, 6, 9, 89, 67, 23, 45 };
        // Comparable[] arrayToBeSort = new Comparable[] { 11, 6, 9, 89, 67, 23, 45 };
        // Comparable[] arrayToBeSort = new Comparable[] { 88, 67, 23, 45 };
        System.out.println("Original array: " + Arrays.toString(arrayToBeSort));
        MergeSortBootomUp.sort(arrayToBeSort);
        System.out.println("Sorted Array: " + Arrays.toString(arrayToBeSort));

    }

}