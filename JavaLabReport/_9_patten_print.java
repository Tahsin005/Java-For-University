package JavaLabReport;

import java.util.Scanner;

public class _9_patten_print {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("First Pattern");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.err.println();
        }
        System.out.println();
        System.out.println("Second Pattern");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= (n - i)){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.err.println();
        }
        sc.close();
    }
}
