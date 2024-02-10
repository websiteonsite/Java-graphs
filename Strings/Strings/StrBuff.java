package Java_program.Strings;

public class StrBuff {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("aang");
        // str.setCharAt(0, 'B');
        // str.append("lore");
        // System.out.println(str + " " + str.length());
        String s = "d";
        for (int i = 0; i < 5; i++) {
            s = s + 'z';
        }
        System.out.println(s + " " + s.length());
    }
}
