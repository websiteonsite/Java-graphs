package Java_program.Strings;

import java.util.Scanner;

public class TakinginputString {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str;
        int i = s.nextInt();
        str = s.next();
        System.out.println(str + " " + str.length());

        // String str2 = s.next();
        // System.out.println(str2 + " " + str2.length());
        // String str3 = s.nextLine();
        // System.out.println(str3 + " " + str3.length());
        s.close();
    }

}
