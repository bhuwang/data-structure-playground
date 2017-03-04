/**
 * 
 */
package com.bhuwan.datastructure.stack;

/**
 * @author bhuwan
 * 
 *         <pre>
 * The capacity is set at creation time
 * Pushes have a precondition that the stack isn't already full
 * Pushing on a full stack is a state exception, not an argument exception
 * The field for the current size doubles as the index of the next item to be pushed, and
 * When popping, we take care to nullify the newly unused slot in the array to prevent a possible memory leak
 *         </pre>
 */
public class BoundedArrayImpl implements Stack {

    private Object[] array;
    private int size = 0;

    public BoundedArrayImpl(int capacity) {
        array = new Object[capacity];
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#push(java.lang.Object)
     */
    @Override
    public void push(Object item) {
        if (size == array.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        array[size++] = item;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#pop()
     */
    @Override
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Cannot pop from empty stack");
        }
        Object popped = array[size - 1];
        array[--size] = null;
        return popped;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#peek()
     */
    @Override
    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Cannot peek from empty stack");
        }
        return array[size - 1];
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#size()
     */
    @Override
    public int size() {
        return size;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
