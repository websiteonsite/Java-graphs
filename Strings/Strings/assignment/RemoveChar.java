package Java_program.Strings.assignment;

import java.util.Scanner;

public class RemoveChar {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                continue;
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        char x = sr.next().charAt(0);
        String ans = removeAllOccurrencesOfChar(str, x);
        System.out.println(ans);

    }
}
