package Recusion2;

//Given k, find the geometric sum i.e.
//1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
//Note :using recursion.

import java.text.DecimalFormat;
import java.util.Scanner;

public class GeoSum {

    public static double doubleGeometricSum(int k) {
        if (k == 0) {
            return 1;
        }
        double total = 1 / Math.pow(2, k);
        total += doubleGeometricSum(--k);
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        double ans = doubleGeometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }
}
