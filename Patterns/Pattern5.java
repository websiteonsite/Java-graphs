import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int k = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(k);
                j = j + 1;
            }
            k = k + 1;
            i = i + 1;
            System.out.println();
        }
    }
}
