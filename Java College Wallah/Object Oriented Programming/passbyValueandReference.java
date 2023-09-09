public class passbyValueandReference {
     static void changeinValue(int a){
         a = 33;
     }
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before : " + a);
        changeinValue(a);
        System.out.println("After : " + a );

    }
}
