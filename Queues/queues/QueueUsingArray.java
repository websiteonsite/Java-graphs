package Queues.queues;

public class QueueUsingArray {

    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray() {

        data = new int[5];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray(int capacity) {

        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int elem) {

    }

    public int front() {

    }

    public int dequeue() {

    }

}
