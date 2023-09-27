class AlgebraClass{
    int a = 10;
    int b = 20;

    int add(){
        return a + b;
    }
    int sub(){
        return a - b;
    }
    int mul(){
        return a * b;
    }
}
public class scope {
    public static void main(String[] args) {
        AlgebraClass obj = new AlgebraClass();
        System.out.println(obj.add());
    }
}
