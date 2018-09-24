package com.mad.dromey.fundamental;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Intellij Idea.
 * Created On : 9/5/18.
 *
 * @Author : madstuff
 */
public class Counting {

    /**
     *
     * @param count total number of students.
     * @return students with marks.
     */
    public int[] inputMarks(int count) {
        Random random = new Random();
        int[] marksArray = new int[count];
        int mark;
        for (int i = 0; i < count; i++) {
            mark = random.nextInt(100);
            marksArray[i] = mark;
        }

        return marksArray;
    }

    /**
     * Calculates random number between -10 and 10.
     * @param count
     * @return
     */
    public int[] randomNumbers(int count) {
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
            System.out.println(randomNum);

            numbers[i] = randomNum;
        }

        return numbers;
    }

    /**
     *
     * @param marksArray array containing students marks.
     * @param passMarks
     * @return
     */
    private int countPassStudents(int[] marksArray, int passMarks) {
        int count = 0;
        for (int i = 0; i < marksArray.length; i++) {
            if (marksArray[i] >= passMarks)
                count++;
        }

        return count;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Counting counting = new Counting();
        int[] marksArray = counting.inputMarks(10);
        int passMarks = 50;
        int totalPass = counting.countPassStudents(marksArray, passMarks);

        System.out.println("Total Passed students : " + totalPass);

        counting.randomNumbers(10);
    }
}
