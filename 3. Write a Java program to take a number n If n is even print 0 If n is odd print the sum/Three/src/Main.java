
//Write a Java program to take a number n: If n is even, print 0; If n is odd, print the sum of digits of n
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Odd");
        } else if (n % 2 == 0) {
            System.out.println(0);
        } else {
            System.out.println("Odd");
        }

    }
}