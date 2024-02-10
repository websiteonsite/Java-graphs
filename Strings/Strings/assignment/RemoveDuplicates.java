package Java_program.Strings.assignment;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {

        String result = "";
        char ch = str.charAt(0);
        result += ch;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                ;
            else
                result += str.charAt(i);
            ch = str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        String ans = removeConsecutiveDuplicates(str);
        ;
        System.out.println(ans);
    }
}
