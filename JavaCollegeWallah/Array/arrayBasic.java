import java.util.Scanner;

public class arrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n; i++){
//            System.out.println(arr[i]);
//        }
        String[] names = new String[n];
        for(int i = 0; i < n; i++){
            names[i] = sc.next();
        }
//        for(int i = 0; i < n; i++){
//            System.out.print(names[i]+" ");
//        }

        //for each
        for(String val: names){
            System.out.print(val+" ");
        }

        sc.close();
    }
}
