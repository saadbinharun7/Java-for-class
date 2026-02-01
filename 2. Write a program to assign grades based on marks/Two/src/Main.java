//2. Write a program to assign grades based on marks:
//80–100 → A, 70–79 → B, 60–69 → C, Below 60 → Fail

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();

        if(number >= 80 && number <= 100){
            System.out.println("Grade: A");
        } else if(number >= 70 && number <= 79){
            System.out.println("Grade: B");
        } else if(number >= 60 && number <= 69){
            System.out.println("Grade: C");
        } else if(number <= 59){
            System.out.println("Grade: Fail");
        } else{
            System.out.println("Wrong number");
        }

        sc.close();
    }
}