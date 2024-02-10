package Queues.Queue_using_2Queues;

//mplement a Stack Data Structure specifically to store integer data using two Queues. You have to implement it in such a way that the push operation is done in O(1) time and the pop and top operations are done in O(N) time.

// There should be two data members, both being Queues to store the data internally. You may use the inbuilt Queue.

// Implement the following public functions :

// 1. Constructor:
// It initialises the data members as required.

// 2. push(data) :
// This function should take one argument of type integer. It pushes the element into the stack and returns nothing.

// 3. pop() :
// It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.

// 4. top :
// It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.

// 5. size() :
// It returns the size of the stack at any given instance of time.

// 6. isEmpty() :
// It returns a boolean value indicating whether the stack is empty or not.

// Operations Performed on the Stack:
// Query-1(Denoted by an integer 1): Pushes an integer data to the stack.

// Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.

// Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.

// Query-4(Denoted by an integer 4): Returns the current size of the stack.

// Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.
// import java.util.Queue;
// import java.util.LinkedList;

public class Stack {

    // public Stack() {
    // //Implement the Constructor
    // static Queue<Integer> q1 = new LinkedList<Integer>();
    // static Queue<Integer> q2 = new LinkedList<Integer>();
    // static int curr_size;
    // }

    // Define the data members
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;

    public Stack() {
        // Implement the Constructor
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }

    public int getSize() {

        return size;
    }

    public boolean isEmpty() {

        return (size == 0);
    }

    public void push(int element) {
        // q2.add(x);

        // while (!q1.isEmpty()) {
        // q2.add(q1.peek());
        // q1.remove();
        // }

        // Queue<Integer> q = q1;
        // q1 = q2;
        // q2 = q;
        q1.add(element);
        size++;
    }

    public int pop() {

        // if (q1.isEmpty())
        // return;
        // q1.remove();

        // Implement the pop() function
        if (q1.isEmpty()) {
            return -1;
        }
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int temp = q1.remove();
        // swap the two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;

        size--;
        return temp;
    }

    public int top() {

        // {
        // if (q1.isEmpty())
        // return -1;
        // return q1.peek();
        // }

        if (q1.isEmpty()) {
            return -1;
        }
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;

        return top;

    }
}
