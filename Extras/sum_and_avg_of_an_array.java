import java.util.Scanner;

public class sum_and_avg_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        System.out.println("Sum : "+sum);
        float avg = (float)sum / n;
        System.out.println("Average : "+ avg);
        sc.close();
    }
    
}