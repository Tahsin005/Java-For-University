import java.util.Scanner;

public class InstanceMethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InstanceMethodExample obj = new InstanceMethodExample();
        System.out.print("Enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is : " + obj.add(a,b));
        sc.close();
    }
    int s;
    public int add(int x,int y){
        s = x + y;
        return s;
    }
}
