class A{
    void method(int x) {
        System.out.println("x = " + x);
    }
}
class B extends A{
    void method(int y){
        System.out.println("Y = " + y);
    }
    void method(String s){
        System.out.println("S = " + s);
    }
}
public class DemoInheritance {
    public static void main(String[] Tahsin) {
        A a1 = new A();
        B a2 = new B();
        a1.method(60);
        a2.method(40);
    }
}
