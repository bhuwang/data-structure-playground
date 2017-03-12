/**
 * 
 */
package com.bhuwan.datastructure.queue;

import java.util.LinkedList;

/**
 * @author bhuwan
 *
 */
public class LinkedListQueue<T> implements Queue<T> {

    LinkedList<T> list = new LinkedList<>();

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#enqueue(java.lang.Object)
     */
    @Override
    public void enqueue(T item) {
        list.addLast(item);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#dequeue()
     */
    @Override
    public T dequeue() {
        return list.removeFirst();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#peek()
     */
    @Override
    public T peek() {
        return list.getFirst();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#size()
     */
    @Override
    public int size() {
        return list.size();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

}
