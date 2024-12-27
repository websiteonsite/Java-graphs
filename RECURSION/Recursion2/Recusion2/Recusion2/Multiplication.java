package Recusion2;
//Given two integers M & N, calculate and return their multiplication using recursion. 

import java.util.Scanner;

//You can only use subtraction and addition for your calculation. 
//No other operators are allowed.

public class Multiplication {

    public static int multiplyTwoIntegers(int m, int n) {

        if (n == 1) {
            return m;
        }
        int total = m + multiplyTwoIntegers(m, --n);
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(multiplyTwoIntegers(m, n));
    }

}
