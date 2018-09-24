package com.mad.algorithms.sorting;

/**
 * Created by Intellij Idea.
 * Created On : 9/20/18.
 *
 * @Author : madstuff
 */
public class Insertion {

    public static void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {

            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j-1]))
                    exchange(a, j, j - 1);
                else
                    break;
            }
        }
    }

    public static void sort(Comparable[] a, int lo, int hi) {

        for (int i = lo; i <= hi; i++) {

            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j-1]))
                    exchange(a, j, j - 1);
                else
                    break;
            }
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
