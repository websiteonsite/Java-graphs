// Code : Character Pattern

// Print the following pattern for the given N number of rows.
// Pattern for N = 4

// A
// BC
// CDE
// DEFG

// Input format :

// Integer N (Total no. of rows)

// Output format :

// Pattern in N lines

// Sample Input :

// 5

// Sample Output :

// A
// BC
// CDE
// DEFG
// EFGHI
// ______________________________________________________________________________________________________________

import java.util.*;

public class Character_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int Start = 'A' + i - 1;
            while (j <= i) {
                System.out.print((char) (Start));
                j++;
                Start++;
            }
            System.out.println();
            i++;
        }
    }
}
