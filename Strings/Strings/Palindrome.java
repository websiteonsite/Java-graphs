package Java_program.Strings;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        boolean isPalindrome = true;

        for (int i = 0, j = str.length() - 1; i < (str.length() / 2); i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String str = "hannah";
        boolean palinString = isPalindrome(str);
        System.out.println(palinString);
    }
}
