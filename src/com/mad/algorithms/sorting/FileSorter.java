package com.mad.algorithms.sorting;

import com.mad.algorithms.util.StdOut;

import java.io.File;

/**
 * Created by Intellij Idea.
 * Created On : 9/20/18.
 *
 * @author : madstuff
 */
public class FileSorter {

    public static void main(String[] args) {
        File directory = new File("/Users/madstuff");
        File[] files = directory.listFiles();

        /*for (int i = 0; i < files.length; i++) {
            StdOut.println(files[i].getName());
        }*/
        // Call Sorting algorithm here.
        Insertion.sort(files);

        for (int i = 0; i < files.length; i++) {
            StdOut.println(files[i].getName());
        }

        System.out.println();
        if (Selection.isSorted(files))
            System.out.println("Test Complete: Files are in sorted order.");
    }

}
