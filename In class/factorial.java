import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid!");
        }
        else{
            int fact = 1;
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            System.out.printf("Factorial of %d! is : %d",n,fact);
        }
    }
    
}
