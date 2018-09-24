package com.mad.dromey.factoring.gcd;

/**
 * Created by Intellij Idea.
 * Created On : 9/11/18.
 *
 * @Author : madstuff
 */
public class GCD {

    public static int calculateGCD(int number1, int number2) {
        int smaller;
        int larger;

        if (number1 >= number2) {
            larger = number1;
            smaller = number2;
        } else {
            larger = number2;
            smaller = number1;
        }

        int remainder;
        do {
            remainder = larger % smaller;
            larger = smaller;
            smaller = remainder;
        } while (remainder != 0);

        return larger;
    }

    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 8;

        int gcd = GCD.calculateGCD(num1, num2);

        System.out.println(" GCD of " + num1 + " and " + num2 + " = " + gcd);
    }
}
