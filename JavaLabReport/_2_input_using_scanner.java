package JavaLabReport;

import java.util.Scanner;

public class _2_input_using_scanner{
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.nextLine();

        System.out.println("Integer : " + n);
        System.out.println("Double : " + d);
        System.out.println("String : " + s);
        sc.close();
    }
}