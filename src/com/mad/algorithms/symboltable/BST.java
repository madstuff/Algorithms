package com.mad.algorithms.symboltable;

/**
 * Created by Intellij Idea.
 * Created On : 9/23/18.
 *
 * @author : madstuff
 */
public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        Node left;
        Node right;

        public Node (Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {

        if (x == null)
            return new Node(key, val);

        int compare = key.compareTo(x.key);

        if (compare < 0)
            x.left = put(x.left, key, val);
        else if (compare > 0)
            x.right = put(x.right, key, val);
        else
            x.value = val;

        return x;
    }

    /**
     *
     * @param key
     * @return value associated with search key.
     */
    public Value get(Key key) {
        Node x = root;

        while (x != null) {
            int compare = key.compareTo(x.key);

            if (compare < 0)
                x = x.left;
            else if (compare > 0)
                x = x.right;
            else
                return x.value;
        }

        return null;
    }

    public void delete(Key key) {

    }

    public Iterable<Key> iterator() {
        return null;
    }
}
