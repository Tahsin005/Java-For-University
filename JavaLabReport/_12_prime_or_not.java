package JavaLabReport;

import java.util.Scanner;

public class _12_prime_or_not {
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ( -1 to stop inputting)");
        while(true){
            int n = sc.nextInt();
            if(n == -1){
                break;
            }
            else{
                boolean ans = isPrime(n);
                if(ans == true){
                    System.out.println(n + " is a prime number");
                }
                else{
                    System.out.println(n + " is not a prime number");
                }
            }
        }
        sc.close();
    }
    
}
