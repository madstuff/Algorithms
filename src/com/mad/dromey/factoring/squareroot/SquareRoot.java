package com.mad.dromey.factoring.squareroot;

/**
 * Created by Intellij Idea.
 * Created On : 9/10/18.
 *
 * @Author : madstuff
 */
public class SquareRoot {

    /**
     *
     * @param number
     * @return
     */
    public static double squareRoot(double number) {
        double error = 0.0001;
        double guess2 = number / 2.0;
        double guess1;
        do{
            guess1 = guess2;
            guess2 = (guess1 + number/guess1)/2;
            //System.out.println(Math.abs(guess1 - guess2));
        } while(Math.abs(guess1 - guess2) >= error);



        return guess2;
    }


    public static void main(String[] args) {
        double number = 3;
        double sqrt = SquareRoot.squareRoot(number);

        System.out.println("Square root of " + number + " = " + String.format(" %.3f", sqrt));

    }
}
