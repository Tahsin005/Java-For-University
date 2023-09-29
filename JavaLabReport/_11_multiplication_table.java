package JavaLabReport;

import java.util.Scanner;

public class _11_multiplication_table {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int number = sc.nextInt();

        System.out.println("Multiplication table for " + number + ":");
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        sc.close();
    }
    
}
