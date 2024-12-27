
public class sumofarray {

    public static int sum(int input[]) {
        int s = 0;
        for (int i = 0; i < input.length; i++) {
            s += input[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        System.out.println(sum(arr));
    }

}
