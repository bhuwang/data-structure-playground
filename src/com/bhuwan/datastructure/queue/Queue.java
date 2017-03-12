/**
 * 
 */
package com.bhuwan.datastructure.queue;

/**
 * @author bhuwan
 *
 */
public interface Queue<T> {

    void enqueue(T item);

    T dequeue();

    T peek();

    int size();

    boolean isEmpty();
}
