package com.mad.algorithms.unionfind;

import com.mad.algorithms.util.StdIn;
import com.mad.algorithms.util.StdOut;

/**
 * Created by Intellij Idea.
 * Created On : 9/19/18.
 *
 * @Author : madstuff
 */
public class SocialNetworkConnectivity {

    /**
     * Modify this to include time.
     * @param args
     */
    public static void main(String[] args) {
        int N = StdIn.readInt();
        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(N);
        //noinspection Duplicates
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            String date = StdIn.readString();
            String time = StdIn.readString();
            if (!weightedQuickUnion.connected(p, q)) {
                weightedQuickUnion.union(p, q);
                StdOut.println(p + " " + q);
            }

            if (weightedQuickUnion.getComponent() == 1) {
                StdOut.println("Date: " + date + " ; Time : " + time);
                break;
            }
        }
    }









}
