package com.mad.algorithms.unionfind;

/**
 * Created by Intellij Idea.
 * Created On : 9/18/18.
 *
 * @Author : madstuff
 */
public class WeightedQuickUnion {
    private int[] id;
    private int[] size;
    int count; // Number of components.

    /**
     * Create an array and set each object to itself.
     * @param N
     */
    public WeightedQuickUnion(int N) {
        count = N;
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 0;
        }
    }

    /**
     * return root.
     * @param i
     * @return
     */
    private int root(int i) {
        while(i != id[i]) {
            // Path compression: Make every node in path point to its grandparent.
            id[i] = id[id[i]];
            i = id[i];
        }


        return i;
    }


    /**
     * Return number of components at a particular time.
     * @return
     */
    public int getComponent() {
        return count;
    }

    /**
     *
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        if (rootP == rootQ) {
            //do nothing.
        } else if(size[rootP] < size[rootQ]) {
            id[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            id[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }

        count--;
    }

}
