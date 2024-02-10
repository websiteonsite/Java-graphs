import java.util.Set;
import java.util.HashMap;
import java.util.*;

public class Intersection {

    public static void intersection(int[] arr1, int[] arr2) {

        if (arr1.length == 0 || arr2.length == 0)
            return;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        HashMap<Integer, Integer> harr1 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (harr1.containsKey(arr1[i]))
                harr1.put(arr1[i], harr1.get(arr1[i]) + 1);
            else
                harr1.put(arr1[i], 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (harr1.containsKey(arr2[i])) {
                if (harr1.get(arr2[i]) != 0) {

                    System.out.print(arr2[i] + " ");
                    harr1.put(arr2[i], harr1.get(arr2[i]) - 1);
                }
            } else
                continue;

        }
    }

}