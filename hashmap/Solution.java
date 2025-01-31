import java.util.Set;
import java.util.HashMap;

public class Solution {

    public static int maxFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);
            } else
                h.put(arr[i], 1);
        }
        int max = 0;
        int maxKey = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)

        {
            if (h.get(arr[i]) > max) {
                max = h.get(arr[i]);
                maxKey = arr[i];
            }
        }

        return maxKey;
    }
}