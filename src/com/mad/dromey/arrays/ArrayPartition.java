package com.mad.dromey.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Intellij Idea.
 * Created On : 9/17/18.
 *
 * @author : madstuff
 */
public class ArrayPartition {

    /**
     * Partition an array into two subsets such that elements <= x are in one subset and
     * elements > x in another subset.
     * @param array
     * @param x
     */
    public static int[] partitionArray(int[] array, int x) {
        int i = 0;
        int j = array.length - 1;

        while (i < j && array[i] <= x)
            i++;
        while (i < j && array[j] > x)
            j--;

        while(i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;

            while (array[i] <= x)
                i++;
            while (array[j] > x)
                j--;
        }

        System.out.println("Partitioned point: " + j);
        return array;
    }

    public static void main(String[] args) {
        int size = new Random().nextInt(10);
        int[] arr = new int[size];

        for(int i=0; i< size; i++) {
            arr[i] = new Random().nextInt(8);
        }

        System.out.println(Arrays.toString(arr));

        int[] partitionedArray = ArrayPartition.partitionArray(arr, 4);

        System.out.println(Arrays.toString(partitionedArray));

    }
}
