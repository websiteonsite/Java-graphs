package Java_program.Strings;

public class Reversedwords {

    public static String reverseString(String str) {
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String str = "Air India";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }
}
