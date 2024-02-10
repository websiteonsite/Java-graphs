package Queues.ReverseQueue;

// You have been given a queue that can store integers as the data.

// You are required to write a function that reverses the populated
// queue itself without using any other data structures.

import java.util.Queue;

public class Solution {

    public static void reverseQueue(Queue<Integer> input) {
        // Your code goes here
        if (input.size() <= 1) {
            return;
        }
        int front = input.poll();
        reverseQueue(input);
        input.add(front);
    }

}