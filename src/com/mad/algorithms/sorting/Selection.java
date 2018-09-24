package com.mad.algorithms.sorting;

/**
 * Created by Intellij Idea.
 * Created On : 9/20/18.
 *
 * @Author : madstuff
 */
public class Selection {

    /**
     * Sort array of Objects using Selection sort mechanism.
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            int min = i;

            for (int j = i + 1; j < N; j++) {
                //System.out.println("j : " + j + " ; min : " + min);
                if (less(a[j], a[min]))
                    min = j;
            }

            exchange(a, i, min);
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


    /**
     * @test tests if array is sorted.
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a) {

        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }

        return true;
    }


    public static void main(String[] args) {

    }



}
