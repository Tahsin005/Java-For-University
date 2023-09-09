package Assignment;

import java.util.Scanner;

public class CandriveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("You are an adult.");

            System.out.print("Do you have a valid driving license? ( 1 for yes/ 2 for no):  ");
            int license = sc.nextInt();
            if (license == 1) {
                System.out.println("You can legally drive.");
            } 
            else if (license == 2) {
                System.out.println("You cannot legally drive without a license.");
            } 
            else {
                System.out.println("Invalid input for license status.");
            }
        }   
        else {
            System.out.println("You are a minor.");
        }
        sc.close();

    }
}
