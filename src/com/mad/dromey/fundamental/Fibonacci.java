package com.mad.dromey.fundamental;

/**
 * Created by Intellij Idea.
 * Created On : 9/6/18.
 *
 * @Author : madstuff
 */
public class Fibonacci {

    /**
     *
     * @param number
     */
    public void fibonacciSeries(int number) {
        int a = 0;
        int b = 1;
        int nextNum;
        System.out.print(a + "\t" + b + "\t");
        int i;
        for ( i = 3; i < number; i += 2) {
            a = a + b;
            b = b + a;

            System.out.print(a + "\t" + b + "\t");
        }
        if (i == number)
            System.out.println(a);
    }

    public boolean isFibonacciSequence(int d, int e) {
        int c;
        int a = d;
        int b = e;
        while(a > 0) {
            c = b - a;
            b = a;
            a = c;
        }
        if (a == 0 && b == 1) {
            System.out.println("Numbers " + d + " and " + e + " are consecutive sequence of Fibonacci numbers");
            return true;
        }
        return false;
    }

    /**
     * Supplementary problem 2.6.6.
     * fn = (fn-2)! + (fn - 1)!
     *
     * @param count
     * @return
     */
    private void generateSequence(int count) {
        int a = 0;
        int b = 1;
        double value;
        for (int i = 3; i <= count; i++) {
            value = Factorial.factorial(i - 3) + Factorial.factorial(i - 2);

            System.out.println("f" + i + " = " + (i - 3) + "! + " + (i - 2) + "! = "  + value);

            a = a + b;
            b = b + a;
        }
    }

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacciSeries(10);
        System.out.println("\n");
        fibonacci.isFibonacciSequence(21,34);

        System.out.println("\nGenerated sequence : ");
        fibonacci.generateSequence(10);
    }
}
