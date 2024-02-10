package Java_program.Strings.assignment;

import java.util.Scanner;

public class ReverseWord {
    public static String reverseEachWord(String str) {
        // Your code goes here
        String reverseWord = "", result = "";
        int start = 0, j, end;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                end = i - 1;
                reverseWord = "";

                for (j = end; j >= start; j--) {
                    reverseWord += str.charAt(j);
                }
                start = i + 1;
                result = result + reverseWord + " ";
            }
        }
        reverseWord = "";

        for (j = str.length() - 1; j >= start; j--) {
            reverseWord += str.charAt(j);
        }

        result = result + reverseWord + " ";
        return result;

    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        String ans = reverseEachWord(str);
        System.out.println(ans);

    }
}
