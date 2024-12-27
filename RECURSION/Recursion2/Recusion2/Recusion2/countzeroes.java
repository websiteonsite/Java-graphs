package Recusion2;

import java.util.Scanner;

// Given an integer N, count and return
// the number of zeros that are present in the given integer using recursion.

public class countzeroes {

    public static int countZerosRec(int input) {
        if (input < 10) {
            if (input == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int rem = input % 10;
        int total = 0;

        if (rem == 0) {
            total++;
        }

        total += countZerosRec(input / 10);
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countZerosRec(n));
    }
}
