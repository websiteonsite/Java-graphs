import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Sequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], true);
        }

        int maxlength = 0;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i])) {
                int length = 0;
                int temp = arr[i];
                while (map.containsKey(temp)) {
                    length++;
                    map.put(temp, false);
                    temp = temp + 1;
                }
                int starttemp = arr[i];
                temp = arr[i] - 1;
                while (map.containsKey(temp)) {
                    length++;
                    map.put(temp, false);
                    starttemp = temp;
                    temp = temp - 1;
                }

                if (length > maxlength) {
                    maxlength = length;
                    start = starttemp;
                } else if (length == maxlength) {
                    maxlength = length;
                    // start = 10 starttemp = 4
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == start) {
                            start = start;
                            break;
                        } else if (arr[j] == starttemp) {
                            start = starttemp;
                            break;
                        }
                    }
                }
            }

        }

        // for(int i = start;i<start+maxlength;i++){
        // output.add(i);
        // }

        output.add(start);
        output.add(start + maxlength - 1);

        return output;
    }
}