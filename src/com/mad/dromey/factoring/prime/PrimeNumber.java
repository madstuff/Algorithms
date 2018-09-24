package com.mad.dromey.factoring.prime;

import com.mad.dromey.factoring.squareroot.SquareRoot;
import java.time.LocalTime;

/**
 * Created by Intellij Idea.
 * Created On : 9/12/18.
 *
 * @author : madstuff
 */
public class PrimeNumber {

    public static boolean isPrimeNumber(long number) {
        // int counter = 2;
        System.out.println(LocalTime.now());
        if( number % 2 == 0 || number % 3 == 0) {
          return false;
        }
        long condition = (long)SquareRoot.squareRoot(number);
        for(long counter = 3; counter < condition; counter += 2) {
            if (number % counter == 0) {
                System.out.println("Number divisible by: " + counter);
                return false;
            }
        }
        System.out.println(LocalTime.now());

        return true;
    }


    public static void main(String[] args) {
        long number = 8888888897888888899L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(" Is number " + number + " prime : " + PrimeNumber.isPrimeNumber(number));
    }

}
