package Assignment;

public class incrementDecrement2 {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Count before loop: " + count);

        for (int i = 1; i <= 5; i++) {
            count++;
            System.out.println("Count after increment " + i + ": " + count);
        }

        for (int i = 1; i <= 3; i++) {
            count--;
            System.out.println("Count after decrement " + i + ": " + count);
        }
    }
}
