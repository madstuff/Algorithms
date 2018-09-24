package com.mad.algorithms.stack;

import com.mad.algorithms.util.StdIn;
import com.mad.algorithms.util.StdOut;

/**
 * Created by Intellij Idea.
 * Created On : 9/19/18.
 *
 * @Author : madstuff
 */
public class LinkedStackOfStrings {

    private Node first = null;

    private class Node {
        String item;
        Node next;
    }
    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node oldFirst = first;
        Node first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {
        String item = null;
        if (!isEmpty()) {
            item = first.item;
            first.next = first;
        }
        return item;
    }

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("-")) StdOut.print(stack.pop());
            else stack.push(s);
        }
    }


}
