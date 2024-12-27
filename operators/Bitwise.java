package operators;

//BitwiseOperators
public class Bitwise {
    public static void main(String args[]) {
        int a = 10;
        int b = 2;
        // int c=a&b
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 3);
        System.out.println(a >> 2);
    }
}

public class BreakKeyword {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + 1 == j) {
                    // break;
                    return;
                }
                System.out.print(j + " ");
            }

        }
        System.out.println();
    }
}

public class ContinueKeyword {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n;) {

            if (i == 4) {

                continue;
            }
            i++;
            System.out.println(i);

        }
        System.out.println();
    }
}
