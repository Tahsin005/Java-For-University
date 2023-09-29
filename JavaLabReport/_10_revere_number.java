package JavaLabReport;

import java.util.Scanner;

public class _10_revere_number {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");;
        int n = sc.nextInt();
        System.out.print("Reverse of " + n + " is : ");
        while(n != 0){
            int digit = n % 10;
            System.out.print(digit);
            n = n / 10;
        }
        sc.close();
    }
}
