/**
 * 
 */
package com.bhuwan.datastructure.stack;

/**
 * @author bhuwan
 *
 */
public interface Stack {

    void push(Object item);

    Object pop();

    Object peek();

    int size();

    boolean isEmpty();
}
