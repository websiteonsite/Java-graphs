package Queues.QueueLL;

// Implement a Queue Data Structure specifically to store integer data using a Singly Linked List.

// The data members should be private.

// You need to implement the following public functions :

// 1. Constructor:
// It initialises the data members as required.

// 2. enqueue(data) :
// This function should take one argument of type integer. It enqueues the element into the queue and returns nothing.

// 3. dequeue() :
// It dequeues/removes the element from the front of the queue and in turn, returns the element being dequeued or removed. In case the queue is empty, it returns -1.

// 4. front() :
// It returns the element being kept at the front of the queue. In case the queue is empty, it returns -1.

// 5. getSize() :
// It returns the size of the queue at any given instance of time.

// 6. isEmpty() :
// It returns a boolean value indicating whether the queue is empty or not.

// Operations Performed on the Stack:
// Query-1(Denoted by an integer 1): Enqueues an integer data to the queue.

// Query-2(Denoted by an integer 2): Dequeues the data kept at the front of the queue and returns it to the caller.

// Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the front of the queue but doesn't remove it, unlike the dequeue function.

// Query-4(Denoted by an integer 4): Returns the current size of the queue.

// Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the queue is empty or not.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= q <= 10^5
// 1 <= x <= 5
// -2^31 <= data <= 2^31 - 1 and data != -1

// Where 'q' is the total number of queries being performed on the queue, 'x' is the range for every query and data represents the integer pushed into the queue. 
/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/

public class Queue {

    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int data) {
        if (size == 0) {
            Node newnode = new Node(data);
            front = newnode;
            rear = newnode;
            size++;
        } else {
            Node newnode = new Node(data);
            rear.next = newnode;
            rear = rear.next;
            size++;
        }
    }

    public int dequeue() {
        if (size == 0)
            return -1;
        if (size == 1) {
            int temp = front.data;
            front = null;
            rear = null;
            size = 0;
            return temp;
        } else {
            int temp = front.data;
            front = front.next;
            size--;
            return temp;
        }
    }

    public int front() {
        if (size == 0)
            return -1;
        return front.data;
    }
}
