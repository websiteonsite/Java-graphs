package Recursion3;

import java.util.*;

public class RemoveDupkicates {

    public static String removeConsecutiveDuplicates(String s) {

        String str = "";
        if (s.length() == 1) {
            str = s;
            return str;
        }
        String actual = removeConsecutiveDuplicates(s.substring(0, s.length() - 1));

        if (s.charAt(s.length() - 1) == actual.charAt(actual.length() - 1)) {
            return actual;
        }

        actual += Character.toString(s.charAt(s.length() - 1));
        return actual;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(removeConsecutiveDuplicates(input));
    }
}
