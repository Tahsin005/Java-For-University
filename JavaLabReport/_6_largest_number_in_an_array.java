package JavaLabReport;

import java.util.Scanner;

public class _6_largest_number_in_an_array {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size / length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        System.err.println("The lagest number in the array is : " + mx);
        sc.close();
    }
    
}
