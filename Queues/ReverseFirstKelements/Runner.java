package Queues.ReverseFirstKelements;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Runner {
    public static Input takeInput() {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();
        int k = sr.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int val = sr.nextInt();
            queue.add(val);
        }

        return new Input(n, k, queue);

    }

    public static void main(String[] args) {
        Input input = takeInput();

        int n = input.n;
        int k = input.k;
        Queue<Integer> queue = input.queue;

        queue = Solution.reverseKElements(queue, k);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
