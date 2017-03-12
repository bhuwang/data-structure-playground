package com.bhuwan.datastructure.queue;

public class BoundedQueue<T> implements Queue<T> {

    private T[] queue = null;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public BoundedQueue(int capacity) {
        queue = (T[]) new Object[capacity];
    }

    @Override
    public void enqueue(T item) {
        if (size == queue.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        queue[tail++] = item;
        size++;
    }

    @Override
    public T dequeue() {
        T firstItem = peek();
        queue[head] = null;
        head++;
        size--;
        return firstItem;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from empty stack");
        }
        return queue[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        BoundedQueue<String> queue = new BoundedQueue<>(5);
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
        System.out.println("=============================");
        queue.enqueue("HomNath");
        queue.enqueue("TejKumari");
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("queue :=");
        for (Object item : queue.queue) {
            System.out.println(item);
        }
        System.out.println("=============================");
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
    }

}
