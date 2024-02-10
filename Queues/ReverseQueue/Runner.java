package Queues.ReverseQueue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Runner {
    static Scanner sr = new Scanner(System.in);

    public static Queue<Integer> takeInput() {

        int n = sr.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int var = sr.nextInt();
            queue.add(var);
        }

        return queue;

    }

    public static void main(String[] args) {

        // Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();

        while (t > 0) {
            Queue<Integer> queue = takeInput();
            Solution.reverseQueue(queue);

            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }

            System.out.println();

            t -= 1;
        }
    }
}