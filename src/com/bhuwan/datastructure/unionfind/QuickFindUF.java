/**
 * 
 */
package com.bhuwan.datastructure.unionfind;

/**
 * @author bhuwan
 *
 */
public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int capacity) {
        id = new int[capacity];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
        QuickFindUF qf = new QuickFindUF(10);
        qf.union(4, 3);
        qf.union(3, 8);
        qf.union(6, 5);
        qf.union(9, 4);
        qf.union(2, 1);
        System.out.println("qf.isConnected(0, 7): " + qf.isConnected(0, 7));
        System.out.println("qf.isConnected(8, 9): " + qf.isConnected(8, 9));
    }

}
