package JavaLabReport;

import java.util.Scanner;

public class _2_input_using_scanner{
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        System.out.println("Enter a Integer value : ");
        int n = sc.nextInt();
        System.out.println("Enter a Double value : ");
        double d = sc.nextDouble();
        System.out.println("Enter a floating value: ");
        float f = sc.nextFloat();

        System.out.println("Integer : " + n);
        System.out.println("Double : " + d);
        System.out.println("String : " + s);
        System.out.println("Float : " + f);
        sc.close();
    }
}