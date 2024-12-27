package Recusion2;

// Determine if a given string ‘S’ is a palindrome using recursion.
// Return a Boolean value of true if it is a palindrome and false if it is not.

public class Palindrome {

    public static boolean isStringPalindrome(String input) {
        // Write your code here
        if (input.length() == 0)
            return true;
        int si = 0;
        int ei = input.length() - 1;
        return helper(input, si, ei);
    }

    private static boolean helper(String input, int si, int ei) {
        if (si == ei)
            return true;
        if (input.charAt(si) != input.charAt(ei))
            return false;
        if (si < ei + 1)
            return helper(input, si + 1, ei - 1);
        return true;
    }

    public static void main(String[] args) {
        takeInput();
        executeAndPrintOutput();
        out.close();
    }
}
