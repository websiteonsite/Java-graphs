
public class Arraysorted {
    // public static boolean isSorted(int a[]) {
    // if (a.length == 1) {
    // return true;
    // }
    // if (a[0] > a[1]) {
    // return false;
    // }
    // int smallArray[] = new int[a.length - 1];
    // for (int i = 1; i < a.length; i++) {
    // smallArray[i - 1] = a[i];
    // }
    // boolean isSmallArraySorted = isSorted(smallArray);
    // return isSmallArraySorted;
    // }

    public static boolean isSortedBetter(int a[], int si) {
        if (si == a.length - 1) {
            return true;
        }
        if (a[si] > a[si + 1]) {
            return false;
        }
        boolean isSmallArraySorted = isSortedBetter(a, si + 1);
        return isSmallArraySorted;
    }

    public static void main(String[] args) {
        int arr[] = { 22, 14, 44, 5, 6, 7, 9 };
        System.out.println(isSortedBetter(arr, 2));
    }
}
