package com.mad.dromey.fundamental;

import java.util.Random;

/**
 * Created by Intellij Idea.
 * Created On : 9/5/18.
 *
 * @Author : madstuff
 */
public class Summation {

    @SuppressWarnings("Duplicates")
    private int[] initializeArray(int count) {
        Random random = new Random();
        int[] marksArray = new int[count];
        int mark;
        for (int i = 0; i < count; i++) {
            mark = random.nextInt(10);
            marksArray[i] = mark;
        }

        return marksArray;
    }

    /**
     * Adding numbers of an array to get sum.
     * @param numbers
     * @return
     */
    private int addNumbers(int[] numbers) {
        int total = 0;
        for (int j = 0; j < numbers.length; j++) {
            total += numbers[j];
        }

        return total;
    }

    /**
     *
     * @param numbers
     * @return
     */
    private int addSquareNumbers(int[] numbers) {
        int total;
        int square;
        total = numbers[0] * numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            square = numbers[j] * numbers[j];
            total += square;
        }

        return total;
    }

    /**
     *
     * @param numbers
     * @return
     */
    private double harmonicMean(int[] numbers) {
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += (1.0/numbers[i]);
        }
        System.out.println("Sum: " + sum);

        return 1.0/sum;
    }

    private int geometricSequence() {

        return 0;
    }

    /**
     * print numbers 1, -1, 1, -1...
     * @param count
     */
    private void printNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.print(-1 + "\t");
            } else
                System.out.print(1 + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Summation summation = new Summation();
        int count = 5;
        int[] numbers = summation.initializeArray(count);
        summation.printArray(numbers);
        int sum = summation.addNumbers(numbers);
        System.out.println(sum);

        float average = (float)sum / count;

        System.out.println("Average : " + average);

        System.out.println("Sum of squares : " + summation.addSquareNumbers(numbers));

        System.out.println("Harmonic mean : " + summation.harmonicMean(numbers));

        summation.printNumbers(10);
    }

    private void printArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();
    }


}
