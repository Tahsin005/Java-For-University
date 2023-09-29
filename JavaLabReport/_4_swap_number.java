package JavaLabReport;

import java.util.Scanner;

public class _4_swap_number {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Swapping using a third Variable
        System.out.println("Before swapping " + a + " and " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping " + a + " and " + b);
        
        // Swapping without using a third variable
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Before swapping " + c + " and " + d);
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("After swapping " + c + " and " + d);
        sc.close();

    }
}
