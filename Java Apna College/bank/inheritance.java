package bank;
/*
 * When the properties of one class is being inherited by another class
 * then it is called inheritance
 */
// import java.util.*;
// import bank.*;
class Shape{
    // String color;
    public void area(){
        System.out.println("Display area"); 
    }
}


class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1 / 2 * l * h);
        // single level inheritance
    }
}

// class EquilateralTriangle{
//         public void area(int l,int h){
//                 System.out.println(l / 2 * l * h);
//         // Multi level inheritance
//     }
// }

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.1416) * r * r);
        // Heirarchical inheritance
    }
}
public class inheritance {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // sc.close();

        bank.Account account1 = new bank.Account();
        account1.name = "Tahsin";

        System.out.println(account1.name);
    }
}
  