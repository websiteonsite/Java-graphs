package Queues.ReverseFirstKelements;

import java.util.*;

public class Solution {

    public static Queue<Integer> reverseKElements(Queue<Integer> q, int k) {
        // Your code goes here
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q1 = new LinkedList<>();

        // FIRST ADD THE K ELEMENTS IN STACK AND REMOVE THEM FROM STACK
        // Q= 1 2 3 4 5 K=3
        // S=1 2 3
        for (int i = 0; i < k; i++) {
            s.add(q.remove());
        }

        // NOW ADD THE REVERSE K ELEMENTS IN ANOTHER QUEUE
        // S=1 2 3
        // Q1=3 2 1
        while (!s.isEmpty()) {
            q1.add(s.pop());
        }

        // NOW ADD THE REMAINING ELEMENTS OF ORIGINAL QUEUE IN ANOTHER QUEUE
        // Q=4 5
        // Q1=3 2 1 4 5
        while (!q.isEmpty()) {
            q1.add(q.remove());
        }

        // NOW ADD ALL THE ELEMENTS OF ANOTHER QUEUE IN ORIGINAL QUEUE
        // Q1=3 2 1 4 5
        // Q= 3 2 1 4 5
        while (!q1.isEmpty()) {
            q.add(q1.remove());
        }

        return q;
    }
}
