/**
 * 
 */
package com.bhuwan.datastructure.queue;

/**
 * @author bhuwan
 *
 */
public class SinglyLinkedListQueue implements Queue {

    private class Node {
        public Object item;
        public Node next;

        public Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#enqueue(java.lang.Object)
     */
    @Override
    public void enqueue(Object item) {
        Node newNode = new Node(item, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#dequeue()
     */
    @Override
    public Object dequeue() {
        Object dequeuedItem = peek();
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return dequeuedItem;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#peek()
     */
    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from empty queue");
        }
        return head.item;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#size()
     */
    @Override
    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.datastructure.queue.Queue#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        SinglyLinkedListQueue queue = new SinglyLinkedListQueue();
        queue.enqueue("Bhuwan");
        queue.enqueue("Prisha");
        queue.enqueue("Pratiksha");
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("=============================");
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("=============================");
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
    }

}
