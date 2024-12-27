//Write a program to find x to the power n (i.e. x^n). 
//Take x and n from the user. You need to return the answer.
//Do this recursively.

import java.util.Scanner;

public class Power_rec {
    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        System.out.println(power(x, n));
    }
}
