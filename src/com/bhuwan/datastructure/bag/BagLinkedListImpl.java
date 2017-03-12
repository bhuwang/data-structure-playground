/**
 * 
 */
package com.bhuwan.datastructure.bag;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author bhuwan
 *
 */
public class BagLinkedListImpl<T> implements Bag<T>, Iterable<T> {

    private Node<T> first = null;

    private class Node<T> {
        private T item;
        private Node<T> next;

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }

    @Override
    public void add(T item) {
        first = new Node<T>(item, first);
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        int count = 0;
        for (Node node = first; node != null; node = node.next) {
            count++;
        }
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        BagLinkedListImpl<Integer> bags = new BagLinkedListImpl<>();
        bags.add(10);
        bags.add(20);
        bags.add(30);
        bags.add(40);
        System.out.println("Size: " + bags.size());
        for (Integer num : bags) {
            System.out.println("Num: " + num);
        }
    }

}
