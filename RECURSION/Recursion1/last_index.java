//Given an array of length N and an integer x, you need to find and return the last 
//index of integer x present in the array. Return -1 if it is not present in the array.
//Last index means - if x is present multiple times in the array, return the index 
//at which x comes last in the array.
//You should start traversing your array from 0, not from (N - 1).
//Do this recursively. Indexing in the array starts from 0.

import java.util.Scanner;

public class last_index {
    static int idx = -1;

    static int helper(int input[], int x, int i) {
        if (i == input.length) {
            return idx;
        } else if (input[i] == x) {
            if (i > idx) {
                idx = i;
            }
        }
        return helper(input, x, i + 1);
    }

    public static int lastIndex(int input[], int x) {
        return helper(input, x, 0);
    }

    public static void main(String[] args) {
        // int[] input = takeInput();
        Scanner s = new Scanner(System.in);
        int[] input = { 11, 12, 11, 14, 22, 11, 24 };
        int x = s.nextInt();
        System.out.println(lastIndex(input, x));
    }
}
