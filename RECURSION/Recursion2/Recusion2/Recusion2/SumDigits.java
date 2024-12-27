package Recusion2;
// Write a recursive function that returns the sum of the digits of a given integer.

import java.util.Scanner;

public class SumDigits {

    public static int sumOfDigits(int input) {
        if (input == 0) {
            return 0;
        }
        int rem = input % 10;
        int total = rem + sumOfDigits(input / 10);
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
