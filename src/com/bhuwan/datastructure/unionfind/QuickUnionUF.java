/**
 * 
 */
package com.bhuwan.datastructure.unionfind;

/**
 * @author bhuwan
 *
 */
public class QuickUnionUF {

    private int[] idArray;

    public QuickUnionUF(int capacity) {
        idArray = new int[capacity];
        for (int i = 0; i < idArray.length; i++) {
            idArray[i] = i;
        }
    }

    private int root(int i) {
        while (i != idArray[i]) {
            i = idArray[i];
        }
        return i;
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        idArray[i] = j;
    }

    public static void main(String[] args) {
        QuickUnionUF qu = new QuickUnionUF(10);
        qu.union(4, 3);
        qu.union(3, 8);
        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);
        System.out.println("qu.isConnected(0, 7): " + qu.isConnected(0, 7));
        System.out.println("qu.isConnected(8, 9): " + qu.isConnected(8, 9));
    }
}
