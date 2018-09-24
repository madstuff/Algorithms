package com.mad.algorithms.stack;

/**
 * Created by Intellij Idea.
 * Created On : 9/19/18.
 *
 * @author : madstuff
 */
public class ResizingArrayStackOfStrings {
    private String[] stack;
    private int N;

    public ResizingArrayStackOfStrings() {
        stack = new String[1];
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];

        for (int i = 0; i < N; i++) {
            copy[i] = stack[i];
        }

        stack = copy;
    }

    public void push(String item) {
        if (N == stack.length) {
            resize(stack.length * 2);
        }

        stack[N++] = item;
    }

    public String pop() {
        String item = stack[--N];
        stack[N] = null;

        if (N > 0 && N == stack.length / 4)
            resize(stack.length/2);

        return item;
    }

}
