package com.mad.dromey.arrays;

import java.util.Arrays;

/**
 * Created by Intellij Idea.
 * Created On : 9/14/18.
 *
 * @Author : madstuff
 */
public class ReverseArray {

    public static int[] reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int temp;
        while(i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        array = ReverseArray.reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
}
