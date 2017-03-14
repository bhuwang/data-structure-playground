/**
 * 
 */
package com.bhuwan.datastructure.sorting;

/**
 * @author bhuwan
 *
 */
public class TestIfArraySorted {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Sorted?: [1,3,7,9]: " + SortUtils.isArraySorted(new Comparable[] { 1, 3, 7, 9 }));

        System.out.println("Sorted?: [1,3,5,6,7,9,12]: " + SortUtils.isArraySorted(new Comparable[] { 1, 3, 5, 6, 7, 9, 12 }));

        System.out.println("Sorted?: [1,1,1,1,1,1]: " + SortUtils.isArraySorted(new Comparable[] { 1, 1, 1, 1, 1, 1 }));

        System.out.println("Sorted?: [2,3,8,7,9]: " + SortUtils.isArraySorted(new Comparable[] { 2, 3, 8, 7, 9 }));

        System.out.println("Sorted?: [12,13,18,7,19]: " + SortUtils.isArraySorted(new Comparable[] { 12, 13, 18, 7, 19 }));
    }

}
