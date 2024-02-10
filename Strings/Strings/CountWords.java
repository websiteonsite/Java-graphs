package Java_program.Strings;

public class CountWords {
    public static int count(String str) {

        if (str.length() == 0)
            return 0;
        int noOfWords = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                noOfWords++;
        }
        return noOfWords;
    }

    public static void main(String[] args) {
        String str = " coding is fun for boys ";
        int countWords = count(str);
        System.out.println(countWords);
    }
}
