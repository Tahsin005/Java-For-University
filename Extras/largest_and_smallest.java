import java.util.Scanner;

public class largest_and_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = -100000;
        int smallest = 100000;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest in the array is : "+largest +"\n"+"Smallest in the array is : "+smallest);
    }
    
}
