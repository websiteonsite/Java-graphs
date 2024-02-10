package Java_program.Strings.assignment;

import java.util.Scanner;

public class HighestOccuring {
    public static char highestOccuringChar(String str) {
        int count = 0;

        char highestChar = str.charAt(0);

        int frequency[] = new int[256];

        for (int i = 0; i < 256; i++)
            frequency[i] = 0;

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count < frequency[str.charAt(i)])

            {
                count = frequency[str.charAt(i)];
                highestChar = str.charAt(i);
            }

        }

        return highestChar;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        char ans = highestOccuringChar(str);
        System.out.println(ans);

    }
}
