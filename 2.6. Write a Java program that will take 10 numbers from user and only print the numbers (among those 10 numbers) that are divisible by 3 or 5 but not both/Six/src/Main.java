
//6. Write a Java program that will take 10 numbers from user and only print the numbers
//(among those 10 numbers) that are divisible by 3 or 5 but not both.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if((arr[i] % 3 == 0 || arr[i] % 5 == 0) && !(arr[i] % 3 == 0 && arr[i] % 5 == 0)){
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}