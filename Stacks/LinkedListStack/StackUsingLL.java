package Stacks.LinkedListStack;

//import java.util.Stack;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;
    private Node<T> tail;

    public StackUsingLL() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    // Pushing happening at he begining of the LL
    public void push(T elem) {
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Since pushing is happening at first node
    // public int top() throws StackEmptyException {
    // if (head == null) {
    // throw new StackEmptyException();
    // }
    // return head.data;

    // }

    public int top() {

        return head.data;

    }

    // public T pop() throws StackEmptyException {
    // if (head == null) {
    // throw new StackEmptyException();
    // }

    public boolean pop() {

        // since we are pushing data in the front so the so we must remove the data from
        // the front itself
        int temp = head.data;
        head = head.next;
        size--;

    }

}
