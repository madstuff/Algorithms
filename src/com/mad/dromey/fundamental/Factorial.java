package com.mad.dromey.fundamental;

/**
 * Created by Intellij Idea.
 * Created On : 9/6/18.
 *
 * @Author : madstuff
 */
public class Factorial {

    public static double factorial(int number) {
        double value = 1;

        if(number == 0) {
            return value;
        } else
            for (int i = 1; i <= number; i++) {
                value *= i;
            }
            return value;
    }

    private boolean isFactorial(int number) {
        boolean factorial = false;
        int counter = 2;

        if (number == 0  || number == 1) {
            factorial = true;
        }

        while(counter != number || counter > number) {
            if (number % counter == 0) {
                number = number /counter;
                counter++;
            } else {
                factorial = false;
                break;

            }
        }

        if (counter == number)
            factorial = true;

        return factorial;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int number = 30;
        double factorialValue = factorial.factorial(number);
        System.out.println("Factorial value for number " + number + " is : " + factorialValue);

        boolean isFactorial = factorial.isFactorial(720);

        System.out.println("Number " + 720 + " is factorial number : " + isFactorial);

    }
}
