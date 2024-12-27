//Given the number 'n',
// write a code to print numbers from 1 to n in increasing order recursively

public class natural_rec {
    public static int print(int n) {
        if (n == 0) {
            return 0;
        }
        print(n - 1);
        System.out.println(n + "");
        return n;
    }

    public static void main(String[] args) {
        print(4);
    }
}
