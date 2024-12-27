//Given an array of length N and an integer x, 
//you need to find and return the first index of integer x present in the array. 
//Return -1 if it is not present in the array.

import java.util.Scanner;

public class firstindex {
    public static int firstIndex(int input[], int x) {

        return ans(input, x, 0);
    }

    public static int ans(int input[], int x, int startIndex) {
        int n = input.length;

        if (startIndex == n) {
            return -1;
        }
        if (x == input[startIndex]) {
            return startIndex;
        }
        return ans(input, x, startIndex + 1);
    }

    static Scanner s = new Scanner(System.in);

    // public static int[] takeInput() {
    // int size = s.nextInt();
    // int[] input = new int[size];
    // for (int i = 0; i < size; i++) {
    // input[i] = s.nextInt();
    // }
    // return input;
    // }

    public static void main(String[] args) {
        int[] input = { 11, 12, 13, 23, 14, 13, 11, 12, 23, 24, 13 };
        int x = s.nextInt();
        System.out.println(firstIndex(input, x));
    }
}
