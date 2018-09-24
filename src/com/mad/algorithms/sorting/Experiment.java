package com.mad.algorithms.sorting;

import java.time.LocalTime;
import java.util.Random;

/**
 * Created by Intellij Idea.
 * Created On : 9/20/18.
 *
 * @author : madstuff
 */
public class Experiment {

    public static void main(String[] args) {
        int size = new Random().nextInt(20000000);
        System.out.println("Size : " + size);

        Integer[] numbers = new Integer[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = new Random().nextInt(1000000);
        }
        System.out.println(LocalTime.now());
        // Call sorting method here and sort the array.
        Shell.sort(numbers);

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + ", ");

            if (i % 11 == 0)
                System.out.println();
        }

        System.out.println();
        System.out.println(LocalTime.now());
        if (Selection.isSorted(numbers))
            System.out.println("Numbers are in sorted order.");
    }

}
