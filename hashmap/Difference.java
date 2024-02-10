import java.util.*;

public class Difference {

    public static int getPairsWithDifferenceK(int arr[], int k) {
        // Write your code here

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                int freq = map.get(key);
                map.put(key, freq + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set<Integer> set = map.keySet();

        int result = 0;
        for (int num : set) {
            int num2 = Math.abs(k + num);
            if (map.containsKey(num2)) {
                if (num == num2) {
                    int f = map.get(num);
                    int temp = (f * (f - 1)) / 2;
                    result += temp;
                } else {
                    int f1 = map.get(num);
                    int f2 = map.get(num2);
                    int temp = f1 * f2;
                    result += temp;
                }
            }
        }
        return result;
    }
}