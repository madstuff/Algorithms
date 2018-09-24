package com.mad.algorithms.sorting;

import java.util.Random;

/**
 * Created by Intellij Idea.
 * Created On : 9/21/18.
 *
 * @author : madstuff
 */
public class StdRandom {

    public static void shuffle(Object[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            int r = new Random().nextInt(i + 1);
            exchange(a, i, r);
        }
    }

    /**
     * Swap item in array a[] at index i with the one at index j.
     * @param a
     * @param i
     * @param j
     */
    private static void exchange(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


}
