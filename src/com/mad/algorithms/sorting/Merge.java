package com.mad.algorithms.sorting;

import java.util.Currency;

/**
 * Created by Intellij Idea.
 * Created On : 9/21/18.
 *
 * @author : madstuff
 */
public class Merge {
    private static final int CUTOFF = 7;
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


    /**
     * @test tests if array is sorted.
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a, int lo, int hi) {

        for (int i = lo; i < hi; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }

        return true;
    }


    /**
     *
     * @param a
     * @param aux
     * @param lo
     * @param mid
     * @param hi
     */
    private static void merge (Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        assert isSorted(a, lo, mid); // a[0..mid] should be sorted.
        assert isSorted(a, mid + 1, hi); // a[mid+1 ... hi] should be sorted.

        // Copy array a[] to aux[]
        for (int k = 0; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(a[j], a[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }

        assert isSorted(a, lo, hi);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo + CUTOFF - 1) {
            Insertion.sort(a, lo,hi);
            return;
        }
        int mid = lo + (hi - lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        if (!less(a[mid+1], a[mid]))
            return;
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }
}
