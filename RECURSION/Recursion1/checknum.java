//Given an array of length N and an integer x, 
//you need to find if x is present in the array or not. 
//Return true or false.Do this recursively.

public class checknum {
    public static boolean checkNumber(int input[], int x) {
        boolean test = false;
        for (int elem : input) {
            if (elem == x) {
                test = true;
                break;
            }
        }
        return test;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 42, 16, 19, 20 };
        System.out.println(checkNumber(arr, 42));
    }
}
