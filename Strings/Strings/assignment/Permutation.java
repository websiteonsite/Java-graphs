package Java_program.Strings.assignment;

import java.util.Scanner;

public class Permutation {
    public static boolean isPermutation(String str1, String str2) {
        // Your code goes here

        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[256];

        for (int i = 0; i < 256; i++) {
            freq[i] = 0;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            ++freq[ch];
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            --freq[ch];
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str1 = sr.nextLine();
        String str2 = sr.nextLine();
        boolean ans = isPermutation(str1, str2);
        System.out.println(ans);
    }
}
