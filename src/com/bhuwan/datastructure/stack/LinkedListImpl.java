/**
 * 
 */
package com.bhuwan.datastructure.stack;

import java.util.LinkedList;

/**
 * @author bhuwan
 *
 */
public class LinkedListImpl implements Stack {

    /**
     * <pre>
     * A stack class implemented as a wrapper around a java.util.LinkedList. All stack methods simply delegate to LinkedList methods.
     * 
     * "The stack wraps the list"
     * "The list is being adapted to use in a stack context"
     * "The stack delegates to the list"
     * "The list interface is being narrowed to that of a stack"
     * </pre>
     */
    LinkedList<Object> list = new LinkedList<>();

    @Override
    public void push(Object item) {
        list.addFirst(item);
    }

    @Override
    public Object pop() {
        return list.removeFirst();
    }

    @Override
    public Object peek() {
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

}
