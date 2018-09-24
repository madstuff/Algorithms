package com.mad.dromey.fundamental;

/**
 * Created by Intellij Idea.
 * Created On : 9/5/18.
 *
 * @author : madstuff
 */
public class ValueExchange {

    public void exchangeValuesOfTwoVariables (int a, int b) {
        int temp = a;

        a = b;
        b = temp;

        System.out.println("a : " + a + " ; b : " + b);
    }

    public void exchangeValuesWithoutTempVariable(int a, int b) {
        a = b - a;
        b = b - a;
        a = a + b;

        System.out.println("a : " + a + " ; b : " + b);
    }

    public int swap (int a, int b) {
        System.out.println("a : " + a + " ; b : " + b);
        return a;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap : ");
        System.out.println("\ta : " + a + " ; b : " + b);

        ValueExchange valueExchange = new ValueExchange();
        a = valueExchange.swap(b, b = a);

        System.out.println("After swap : ");
        System.out.println("\ta : " + a + " ; b : " + b);

    }

}
