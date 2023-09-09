package Assignment;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three sides of triangle: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a + b > c || b + c > a || a + c > b) {
            System.out.println("The triangle is valid");
        } 
        else {
            System.out.println("The triangle is not valid");
        }
        scanner.close();

        
    }
}
