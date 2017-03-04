/**
 * 
 */
package com.bhuwan.datastructure.queue;

/**
 * @author bhuwan
 *
 */
public interface Queue {

    void enqueue(Object item);

    Object dequeue();

    Object peek();

    int size();

    boolean isEmpty();
}
