
//7. Write a program in java to display the summation of the even digits of a number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int digit;

        while (n > 0) {
            digit = n % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            n = n / 10;
        }

        System.out.println(sum);
    }
}