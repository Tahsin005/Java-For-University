//import java.util.Scanner;

class Algebra{
    int a,b;
    Algebra(int x,int y){
        System.out.println("Constructor of algebra class is called");
        a = x;
        b = y;
    }

    int add(){
        int ans = a + b;
        return ans;
    }
    int sub(){
        return a - b;
    }
    int mul(){
        return a * b;
    }
}
public class addTwoNumbersUsingMethods {
    public static void main(String[] args) {
        Algebra obj = new Algebra(5,7);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
        int ans = obj.add();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Algebra ob = new Algebra(10,20);
        System.out.println(ob.add());
        System.out.println(ob.sub());
        System.out.println(ob.mul());
    }
}
