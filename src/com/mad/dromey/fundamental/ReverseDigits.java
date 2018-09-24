package com.mad.dromey.fundamental;

/**
 * Created by Intellij Idea.
 * Created On : 9/7/18.
 *
 * @Author : madstuff
 */
public class ReverseDigits {

    public int reverseDigits(int number) {

        int reverseNum = 0;
        int mod;
        while(number != 0) {
            mod = number % 10;
            number /= 10;

            reverseNum *= 10;
            reverseNum = reverseNum + mod;

        }
        return reverseNum;
    }

    public static void main(String[] args) {
        ReverseDigits reverseDigits = new ReverseDigits();
        int number = 123401789;
        int reverseNum = reverseDigits.reverseDigits(number);

        System.out.println("Number: " + number + " ; ReverseNumber: " +reverseNum);
    }

}
