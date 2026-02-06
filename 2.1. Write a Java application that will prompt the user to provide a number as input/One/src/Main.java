
//1. Write a Java application that will prompt the user to provide a number as input.
// Read input as a number and display the square of the number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        long n = sc.nextInt();

        System.out.println(n*n);

        sc.close();
    }
}