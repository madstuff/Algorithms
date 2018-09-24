package com.mad.dromey.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Intellij Idea.
 * Created On : 9/15/18.
 *
 * @author : madstuff
 */
public class DuplicateRemoval {

    public static int[] removeDuplicates(int[] numbers) {
        int i = 0;
        int j = 1;

        while (j < numbers.length) {
            while (j < numbers.length && numbers[i] == numbers[j]) {
                j++;
            }
            if (j < numbers.length)
                numbers[++i] = numbers[j];
        }

        // Copy old array to a new ones containing only non-duplicate values.
        System.out.println("Print after loop i : " + i);
        int[] array = Arrays.copyOf(numbers, i+1);

        return array;
    }

    public static void main(String[] args) {
        int size = new Random().nextInt(100);
        int[] arr = new int[size];

        for(int i=0; i< size; i++) {
             arr[i] = new Random().nextInt(20);
        }
        Arrays.sort(arr);

        System.out.println("arr " + Arrays.toString(arr));

        int[] newArray = DuplicateRemoval.removeDuplicates(arr);

        System.out.println(Arrays.toString(newArray));
    }

}
