/**
 * 
 */
package com.bhuwan.datastructure.stack;

import java.util.NoSuchElementException;

/**
 * @author bhuwan
 *
 *         An implementation of the stack interface using singly-linked nodes.
 */
public class SinglyLinkedStack implements Stack {

    private class Node {
        public Object data;
        public Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node top = null;

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#push(java.lang.Object)
     */
    @Override
    public void push(Object item) {
        top = new Node(item, top);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#pop()
     */
    @Override
    public Object pop() {
        Object item = peek();
        top = top.next;
        return item;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#peek()
     */
    @Override
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#size()
     */
    @Override
    public int size() {
        int count = 0;
        for (Node node = top; node != null; node = node.next) {
            count++;
        }
        return count;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

}
