// Code : Triangle Number Pattern

// Print the following pattern for the given N number of rows.
// Pattern for N = 4

// 1
// 22
// 333
// 4444

// Input format :

// Integer N (Total no. of rows)

// Output format :

// Pattern in N lines

// Sample Input :

// 5

// Sample Output :

// 1
// 22
// 333
// 4444
// 55555

// ______________________________________________________________________________________________________

import java.util.*;

public class Triangle_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int k = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(k);

                j = j + 1;
            }
            k = k + 1;
            i = i + 1;
            System.out.println();
        }
    }
}
