
//5. Write a program that will take two integer numbers from user, and print the LCM of those
//numbers.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        int lcm = max;

        for(int i = max; ;i++){
            if(i % num1 == 0 && i % num2 == 0){
                lcm = i;
                break;
            }
        }

        System.out.println("LCM Is = " +lcm);

        sc.close();

    }
}