package com.mad.algorithms.unionfind;


import com.mad.algorithms.util.StdIn;
import com.mad.algorithms.util.StdOut;

/**
 * Created by Intellij Idea.
 * Created On : 9/18/18.
 *
 * @author : madstuff
 */
public class UF {

    /**
     * Initialize union-find data structure with N objects.
     *
     * @param n
     */
    UF(int n) {

    }

    /**
     * Add connection between p and q.
     *
     * @param p
     * @param q
     */
    void union(int p, int q) {

    }

    /**
     * are p and q in the same component?
     *
     * @param p
     * @param q
     * @return
     */
    boolean connected(int p, int q) {

        return false;
    }

    /**
     * Dynamic connectivity client:
     *
     * @param args
     */

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }

    }
}
