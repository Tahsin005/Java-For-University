package Assignment;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a four digit number: ");
        int number = scanner.nextInt();
        
        int n4 = number % 10;
        number = number / 10;
        int n3 = number % 10;
        number = number / 10;
        int n2 = number % 10;
        number = number / 10;
        int n1 = number % 10;

        System.out.println("Sum of first and last digit is: " + (n1 + n4));

        int sum = n1 + n2 + n3 + n4;
        System.out.println("Sum of all digits are: " + sum);
    }
}