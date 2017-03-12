/**
 * 
 */
package com.bhuwan.datastructure.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
public class BoundedArrayImpl<T> implements Stack<T>, Iterable<T> {

    private T[] stack;
    private int size = 0;

    public BoundedArrayImpl(int capacity) {
        stack = (T[]) new Object[capacity];
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#push(java.lang.Object)
     */
    @Override
    public void push(T item) {
        if (size == stack.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        stack[size++] = item;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#pop()
     */
    @Override
    public T pop() {
        T popped = peek();
        stack[--size] = null;
        return popped;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#peek()
     */
    @Override
    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek from empty stack");
        }
        return stack[size - 1];
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

    @Override
    public Iterator<T> iterator() {

        return null;
    }

    public static void main(String[] args) {
        BoundedArrayImpl<Integer> stack = new BoundedArrayImpl<>(15);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);

        BoundedArrayImpl<String> stringStack = new BoundedArrayImpl<>(15);
        stringStack.push("1");
        stringStack.push("2");
        stringStack.push("3");
        stringStack.pop();
        stringStack.push("4");
    }

}
