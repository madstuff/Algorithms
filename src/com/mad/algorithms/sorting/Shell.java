package com.mad.algorithms.sorting;

/**
 * Created by Intellij Idea.
 * Created On : 9/20/18.
 *
 * @author : madstuff
 */
public class Shell {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;

        while (h < N/3) {
            h = 3*h + 1;
        }

        while(h >= 1) {
            for (int i = h; i < N; i++)
            {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
                    exchange(a, j, j-h);
            }

            h = h/3;
        }

    }


    /**
     * Swap item in array a[] at index i with the one at index j.
     * @param a
     * @param i
     * @param j
     */
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    /**
     * Checks whether x is less than y.
     *
     * @param x
     * @param y
     * @return
     */
    private static boolean less(Comparable x, Comparable y) {
        return x.compareTo(y) < 0;

    }
}
