/**
 * 
 */
package com.bhuwan.datastructure.queue;

import java.util.LinkedList;

/**
 * @author bhuwan
 *
 */
public class LinkedListQueue implements Queue {

    LinkedList<Object> list = new LinkedList<>();

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#enqueue(java.lang.Object)
     */
    @Override
    public void enqueue(Object item) {
        list.addLast(item);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#dequeue()
     */
    @Override
    public Object dequeue() {
        return list.removeFirst();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#peek()
     */
    @Override
    public Object peek() {
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
