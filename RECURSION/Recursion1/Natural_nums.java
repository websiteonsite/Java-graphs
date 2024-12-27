public class Natural_nums {
    public static int print1ton(int n) {
        if (n == 0) {
            return n;
        }
        System.out.println(n);
        return print1ton(n - 1);
    }

    public static void main(String[] args) {
        print1ton(6);
    }
}
