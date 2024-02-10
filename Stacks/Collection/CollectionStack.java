package Stacks.Collection;

import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        int arr[] = { 5, 6, 7, 8, 9 };

        for (int elem : arr) {
            stack.push(elem);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
