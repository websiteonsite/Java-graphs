import java.util.HashMap;

public class Unique {

    public static String uniqueChar(String str) {
        HashMap<Character, Boolean> h = new HashMap<>();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (h.containsKey(str.charAt(i)))
                continue;
            s = s + str.charAt(i);
            h.put(str.charAt(i), true);
        }
        return s;

    }
}