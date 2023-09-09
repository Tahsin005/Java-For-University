import java.util.Scanner;

public class multidimensionalArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n,m;
//        n = sc.nextInt();
//        m = sc.nextInt();
//        int[][] arr = new int[n][m];
        int[][] arr = {{1,2,3},{8,9}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < m; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for(int[] val: arr){
//            System.out.print(val+" ");
//        }
        // sc.close();

    }
}
