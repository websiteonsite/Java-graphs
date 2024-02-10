package Java_program.Strings;

public class Printsubstr {
    public static int printSubstrings(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "coding";
        int printsubst = printSubstrings(str);
        System.out.println(printsubst);
    }
}
