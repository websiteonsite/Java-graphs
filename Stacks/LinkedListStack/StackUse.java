package Stacks.LinkedListStack;

//import java.util.Stack;
//import Stacks.ArrayStacks.StackEmptyException;

public class StackUse {
    // public static void main(String[] args) throws StackFullException,
    // StackEmptyException {
    public static void main(String[] args) {
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        int arr[] = { 5, 6, 7, 1, 9 };
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // stack.push(10);
        // System.out.println(stack.top());
        // stack.pop();
        // stack.size();
        // System.out.println(stack.isEmpty());
        // stack.isEmpty();
    }
}
