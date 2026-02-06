
//5. Write a Java program to find the summation and average of 3 integer values.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();
        float num3 = sc.nextInt();

        float sum = num1 + num2 + num3;
        System.out.println("Summation is = " +sum);

        float avg = sum / 3;
        System.out.println("Average is = " +avg);

        sc.close();
    }
}