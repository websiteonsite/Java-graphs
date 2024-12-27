//You are given a number 'n'.
//Return number of digits in ‘n’.

import java.util.Scanner;

public class NumDigits {
    public static int count(int n) {
        int count_digit = 0;
        while (n != 0) {
            n = n / 10;
            ++count_digit;
        }
        return count_digit;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }
}
