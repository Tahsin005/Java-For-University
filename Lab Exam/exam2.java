import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a students number : ");

        int n = sc.nextInt();

        if(n >= 40){
            if(n <= 100 && n >= 80)
                System.out.println("The student got A+");
            else if(n <= 79 && n >= 75)
                System.out.println("The student got A");
            else if(n <= 74 && n >= 70)
                System.out.println("The student got A-");
            else if(n <= 69 && n >= 65)
                System.out.println("The student got B+");
            else if(n <= 64 && n >= 60)
                System.out.println("The student got B");
            else if(n <= 59 && n >= 55)
                System.out.println("The student got C+");
            else if(n <= 54 && n >= 50)
                System.out.println("The student got C");
            else if(n <= 49 && n >= 45)
                System.out.println("The student got D+");
            else if(n <= 44 && n >= 40)
                System.out.println("The student got D");
        }
        else{
            System.out.println("Student failed.");
        }
    }
    
}
