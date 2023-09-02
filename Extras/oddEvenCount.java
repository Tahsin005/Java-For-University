import java.util.Scanner;

public class oddEvenCount {
    public static void main(String[] args) {
        // WAP to count the number of odd and even element in an array;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int odd_count = 0, even_count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] %2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("The number of odd elements in the array is : "+ odd_count);
        System.out.println("The number of even element in the array is : "+ even_count);
        sc.close();
    }
    
}
