package com.mad.algorithms.stack;

import com.mad.algorithms.util.StdIn;
import com.mad.algorithms.util.StdOut;

/**
 * Created by Intellij Idea.
 * Created On : 9/20/18.
 *
 * @author : madstuff
 */
public class EvaluateInfix {

    public static void main(String[] args) {
        Stack<String> operation = new Stack<>();
        Stack<Double> value = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            System.out.println("Input String: " + s);

            if (s.equals("("));
            else if (s.equals("+")) {
                operation.push(s);
                System.out.println("Pushed into operation stack.");
            } else if (s.equals("*")) {
                operation.push(s);
                System.out.println("Pushed into operation stack.");
            } else if (s.equals(")")) {
                String op = operation.pop();
                System.out.println("Operation: " + op);
                if (op.equals("+")) {
                    value.push(value.pop() + value.pop());
                } else if (op.equals("*")) {
                    value.push(value.pop() * value.pop());
                }
            } else {
                value.push(Double.parseDouble(s));
                System.out.println("Pushed into value stack.");
            }


        }

        StdOut.println(value.pop());
    }
}
