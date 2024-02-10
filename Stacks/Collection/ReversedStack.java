package Stacks.Collection;

import java.util.Scanner;
import java.util.Stack;

public class ReversedStack {

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        // Your code goes here
        if (input.size() <= 1) {
            return;
        }
        int lastElement = input.pop();

        reverseStack(input, extra);
        while (!input.isEmpty()) {
            int top = input.pop();
            extra.push(top);
        }

        input.push(lastElement);
        while (!extra.empty()) {
            int top = extra.pop();
            input.push(top);
        }
    }

    public static Stack<Integer> takeInput() {
        Scanner sr = new Scanner(System.in);

        int size = sr.nextInt();
        Stack<Integer> input = new Stack<>();

        if (size == 0) {
            return input;
        }

        for (int i = 0; i < size; i++) {
            int var = sr.nextInt();
            input.push(var);
        }

        return input;
    }

    public static void main(String[] args) {

        Stack<Integer> input = takeInput();
        Stack<Integer> empty = new Stack<>();
        reverseStack(input, empty);

        while (!input.isEmpty()) {
            System.out.print(input.pop() + " ");
        }

    }
}
