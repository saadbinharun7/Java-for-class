
//4. Find the max and min of 3 numbers.
//  a. Inside main, declare 3 integer variables and assign 3 different values.
//  b. Implement the logic to find the max and min of those 3 values and print the values.


public class Main {
    public static void main(String[] args){
        int a = 10;
        int b = 90;
        int c = 30;

        if(a > b && a > c){
            System.out.println("Max of this 3 number is: " +a);
        } else if (b > a && b > c) {
            System.out.println("Max of this 3 number is: " +b);
        }else{
            System.out.println("Max of this 3 number is: " +c);
        }
    }
}