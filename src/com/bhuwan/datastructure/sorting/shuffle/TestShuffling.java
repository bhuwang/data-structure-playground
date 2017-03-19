/**
 * 
 */
package com.bhuwan.datastructure.sorting.shuffle;

import java.util.Arrays;

/**
 * @author bhuwan
 *
 */
public class TestShuffling {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Original Array: { 1, 2, 3, 4, 5, 6 }");
        Object[] shuffle = KnuthShuffle.shuffle(new Object[] { 1, 2, 3, 4, 5, 6 });
        System.out.println("Shuffled Array: " + Arrays.toString(shuffle));
    }

}
