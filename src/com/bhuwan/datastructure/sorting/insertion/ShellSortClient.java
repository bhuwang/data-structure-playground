/**
 * 
 */
package com.bhuwan.datastructure.sorting.insertion;

import java.util.Arrays;

/**
 * @author bhuwan
 *
 */
public class ShellSortClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Original array: {12, 5, 6, 9, 1, 32, 4 }");
        Comparable[] sortedArray = ShellSort.sort(new Comparable[] { 12, 5, 6, 9, 1, 32, 4 });
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

    }

}
