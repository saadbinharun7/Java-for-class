
//1.Write a program to check whether a person is eligible to vote (age ≥ 18).

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are not eligible to vote");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        sc.close();
    }
}