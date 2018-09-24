package com.mad.algorithms.unionfind;

import com.mad.algorithms.util.StdIn;
import com.mad.algorithms.util.StdOut;

/**
 * Created by Intellij Idea.
 * Created On : 9/18/18.
 *
 * @author : madstuff
 */
public class QuickFindUF {
    private int[] id;

    /**
     * Create an array and set each object to itself.
     * @param N
     */
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * If p and q are in same component then they are connected.
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {

        return id[p] == id[q];
    }

    public void union(int p, int q) {
        if (!connected(p, q)){
            int pId = id[p];
            int qId = id[q];

            for (int i = 0; i < id.length; i++) {
                if (id[i] == pId) {
                    id[i] = qId;
                }
            }
        }
    }


    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickFindUF quickFindUF = new QuickFindUF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!quickFindUF.connected(p, q)) {
                quickFindUF.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
