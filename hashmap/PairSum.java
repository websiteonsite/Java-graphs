import java.util.*;

public class PairSum {

    public static int PairSum(int[] input, int size) {
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int b = 0 - input[i];

            if (map.containsKey(b)) {
                int x = map.get(b);
                count = count + x;
            }

            if (map.containsKey(input[i])) {
                int v = map.get(input[i]);
                v++;
                map.replace(input[i], v);
            } else {
                map.put(input[i], 1);
            }
        }
        return count;
    }
}