package operators;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String args[]) {
        int a = 60, b = 80;
        if (++a > 60 || b++ > 80) {
            System.out.println("Inside if");
        } else {
            System.out.println("Inside else");
        }
        System.out.println("a " + a + " b" + b);
        // int a=60;
        // a=a+1;
        // int b=a++;
        // System.out.println(a);
        // System.out.println(b);
    }
}

public class ForLoops {
    public static void main(String args[]) {
        int n = 5;
        // int i=1;
        // while(i<=n){
        // System.out.println(i);
        // i++;
        // }
        // for(int i=1;j=100;i<=n && j<=200;i++,j+=40){
        // System.out.println(i+" "+j);
        // }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("i " + i + "  j " + j);
            }
        }
    }
}