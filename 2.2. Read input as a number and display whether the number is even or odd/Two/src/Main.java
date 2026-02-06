
//2. Write a java program that will prompt the user to provide a number as input. Read input
//as a number and display whether the number is even or odd.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        sc.close();
    }
}