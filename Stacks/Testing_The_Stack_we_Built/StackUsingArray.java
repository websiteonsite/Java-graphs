package Stacks.Testing_The_Stack_we_Built;

import Stacks.LinkedListStack.StackFullException;

public class StackUsingArray {

    private int data[];
    private int topIndex; // Index of the top most element of the stack

    public StackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }

    public StackUsingArray() {
        data = new int[10];
        topIndex = -1;
    }

    // O(1)
    public int size() {
        return topIndex + 1;
    }

    // O(1)
    public boolean isEmpty() {
        // if(topIndex==-1) return true;
        // else return false;
        return topIndex == -1;
    }

    // O(1);
    public void push(int elem) throws StackFullException {
        // If stack is full
        if (topIndex == data.length - 1) {
            StackFullException e = new StackFullException();
            throw e;
            // Throw Exception
        }
        topIndex++;
        data[topIndex] = elem;
    }

    // O(1)
    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            // Throw stack empty exception
            throw new StackFullException();
        }
        return data[topIndex];

    }

    // O(1)
    public int pop() throws StackEmptyException{

        if(topIndex==-1){
            throw new StackEmptyException()
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

}
