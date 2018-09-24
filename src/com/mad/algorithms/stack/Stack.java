package com.mad.algorithms.stack;

import com.mad.algorithms.util.StdIn;
import com.mad.algorithms.util.StdOut;

import java.util.Iterator;

/**
 * Created by Intellij Idea.
 * Created On : 9/19/18.
 *
 * @author : madstuff
 */
public class Stack<Item> implements Iterable {
    private Node first = null;

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;


        public boolean hasNext() {
            return current != null;
        }

        public void remove() {  /* not supported */ }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

    }


    private class Node {
        Item item;
        Node next;
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node oldFirst = first;
        Node first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Item pop() {
        Item item = null;
        if (!isEmpty()) {
            item = first.item;
            first = first.next;
        }
        return item;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("-")) StdOut.print(stack.pop());
            else stack.push(s);
        }
    }
}
