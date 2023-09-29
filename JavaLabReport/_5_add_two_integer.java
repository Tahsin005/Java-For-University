package JavaLabReport;

import java.util.Scanner;

public class _5_add_two_integer {
    int add(int a,int b){
        return a + b;
    }
    long add(long a,long b){
        return a + b;
    }
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        _5_add_two_integer sum = new _5_add_two_integer();
        int small_integer = sum.add(a, b);
        System.out.println("Addition of two small integer : " + small_integer);

        long c = sc.nextLong();
        long d = sc.nextLong();
        long large_integer = sum.add(c, d);
        System.out.println("Addition of two large integer : " + large_integer);
        sc.close();
    }
    
}
 