
//2.8. Write a java program to print the Fibonacci series up to n th item. The value of n will be provided by the user as input

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(", ");
            }

            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
