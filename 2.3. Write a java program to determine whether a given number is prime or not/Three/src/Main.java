
//3. Write a java program to determine whether a given number is prime or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println("Given number is Prime");
        }else{
            System.out.println("Given number is Not Prime");
        }

        sc.close();
    }
}