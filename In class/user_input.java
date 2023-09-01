import java.util.*;
public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a integer number : ");
        int n ;
        n  = sc.nextInt();
        int m = sc.nextInt();
        System.out.printf("This is an integer number %d",n);
        // System.out.println("This is an integer number : "+n);
        
        String ch = sc.nextLine();
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        System.out.printf("This is an strign %s",s);
        System.out.println("This is a string : "+s);
        
        System.out.println("Enter a floating number : ");
        // System.out.println("This is a floating number : "+m);
        System.out.println("Hello "+ (int)(n + m));
        // System.out.println("Hello "+ n + m);

        // System.out.printf("%d %d %d\n",n,m, n + m);
        // // System.out.println();
        // System.out.println("hello " + n + m);
        
    }
}
