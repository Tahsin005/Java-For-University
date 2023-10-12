import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findEvenOdd(num);
        sc.close();
    }

    public static void findEvenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}
