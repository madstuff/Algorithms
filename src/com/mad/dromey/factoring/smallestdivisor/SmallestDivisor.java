package com.mad.dromey.factoring.smallestdivisor;

import com.mad.dromey.factoring.squareroot.SquareRoot;

/**
 * Find smallest divisor of an integer
 *
 * Created by Intellij Idea.
 * Created On : 9/11/18.
 *
 * @author : madstuff
 */
public class SmallestDivisor {


    public static int smallestDivisor(int number) {

        if (number % 2 == 0)
            return 2;
        else{
            int divisor = 3;
            int sqrtNumber = (int)SquareRoot.squareRoot(number);
            while(number % divisor != 0 && divisor <= sqrtNumber) {
                divisor += 2;
            }

            if (number % divisor == 0) {
                return divisor;
            } else
                return 1;
        }
    }

    public static void main(String[] args) {
        int number = 1234567;

        System.out.println("Smallest divisor of the number : " + SmallestDivisor.smallestDivisor(number));
    }
}
