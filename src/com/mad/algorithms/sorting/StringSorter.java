package com.mad.algorithms.sorting;

import com.mad.algorithms.util.In;
import com.mad.algorithms.util.StdOut;

/**
 * Created by Intellij Idea.
 * Created On : 9/20/18.
 *
 * @Author : madstuff
 */
public class StringSorter {

    public static void main(String[] args) {
        String[] a = In.readStrings(args[0]); // Read file from a location and initialize array.

        // Sort String array.


        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);

        }
    }
}
