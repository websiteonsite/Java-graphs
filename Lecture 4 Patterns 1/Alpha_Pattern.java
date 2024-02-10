//  Alpha Pattern

// Print the following pattern for the given N number of rows.
// Pattern for N = 3

//  A
//  BB
//  CCC

// Input format :

// Integer N (Total no. of rows)

// Output format :

// Pattern in N lines

// Sample Input :

// 7

// Sample Output :

// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF
// GGGGGGG

// ________________________________________________________________________________________________________

import java.util.*;

public class Alpha_Pattern {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i = 1;
    int k = 65;
    while (i <= n) {
      int j = 1;
      while (j <= i) {
        System.out.print((char) k);

        j = j + 1;
      }
      k = k + 1;
      i = i + 1;
      System.out.println();
    }
  }
}
