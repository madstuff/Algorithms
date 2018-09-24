package com.mad.algorithms.stack;

/**
 * Created by Intellij Idea.
 * Created On : 9/19/18.
 *
 * @author : madstuff
 */
public class LinkedQueueOfStrings {
    private Node first, last;

    private class Node{
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(String item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;

        if (isEmpty()){
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public String dequeue() {
        String item = null;
        if (!isEmpty()) {
            item = first.item;
            first = first.next;

            if (isEmpty()) {
                last = null;
            }

        }
        return item;
    }
}
