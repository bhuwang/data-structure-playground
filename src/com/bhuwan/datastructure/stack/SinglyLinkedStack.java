/**
 * 
 */
package com.bhuwan.datastructure.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author bhuwan
 *
 *         An implementation of the stack interface using singly-linked nodes. Though Iterator is not the stack operation I am only
 *         demonstrating the example here.
 */
public class SinglyLinkedStack<T> implements Stack<T>, Iterable<T> {

    public static void main(String[] args) {
        SinglyLinkedStack<String> stack = new SinglyLinkedStack<>();
        stack.push("Bhuwan");
        stack.push("Pratiksha");
        stack.push("Prisha");
        stack.push("new mem");
        for (String item : stack) {
            System.out.println(item);
        }
    }

    private class Node {
        public T data;
        public Node next;

        public Node(T data, Node next) {
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
    public void push(T item) {
        top = new Node(item, top);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#pop()
     */
    @Override
    public T pop() {
        T item = peek();
        top = top.next;
        return item;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.stack.Stack#peek()
     */
    @Override
    public T peek() {
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

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {

        private Node current = top;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = current.data;
            current = current.next;
            return item;
        }

    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (T item : this) {
            string.append(item);
            string.append(" ");
        }
        return string.toString();
    }

}
