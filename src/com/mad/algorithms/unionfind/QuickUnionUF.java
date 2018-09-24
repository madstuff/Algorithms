package com.mad.algorithms.unionfind;

/**
 * Created by Intellij Idea.
 * Created On : 9/18/18.
 *
 * @author : madstuff
 */
public class QuickUnionUF {
    private int[] id;

    /**
     * Create an array and set each object to itself.
     * @param N
     */
    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * return root.
     * @param i
     * @return
     */
    private int root(int i) {
        while(i != id[i])
            i = id[i];

        return i;
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

    /**
     *
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        id[rootP] = rootQ;
    }


}
