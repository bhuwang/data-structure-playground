/**
 * 
 */
package com.bhuwan.datastructure.sorting.shuffle;

import java.util.Random;

import com.bhuwan.datastructure.sorting.SortUtils;

/**
 * <pre>
 * Knuth shuffling algo produces a uniformly random permutation of the input array  in 
 * linear time.
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class KnuthShuffle {

    public static Object[] shuffle(Object[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            /**
             * <pre>
             * nextInt is normally exclusive of the top value, so add 1 to make it inclusive
             * Random r = new Random();
             * int Low = 10;
             * int High = 100;
             * int Result = r.nextInt(High - Low) + Low;
             * </pre>
             */
            int r = new Random().nextInt((i + 1) - 0) + 0;
            SortUtils.exch(a, i, r);
        }
        return a;
    }
}
