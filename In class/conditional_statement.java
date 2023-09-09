import java.util.*;
public class conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input marks scored by you : ");
        int obtainedMarks = sc.nextInt();
        int passingMark = 40;
        if(obtainedMarks >= passingMark){
            if(obtainedMarks >= 90 && obtainedMarks <= 100){
                System.out.println("A");
            }
            else if(obtainedMarks >= 80 && obtainedMarks <= 89){
                System.out.println("B");
            }
            else if(obtainedMarks >= 70 && obtainedMarks <= 79){
                System.out.println("C");
            }
            else if(obtainedMarks >= 60 && obtainedMarks <= 69){
                System.out.println("D");
            }
            else if(obtainedMarks >= 50 && obtainedMarks <= 59){
                System.out.println("E");
            }
            else if(obtainedMarks >= 40 && obtainedMarks <= 49){
                System.out.println("G");
            }
        }
        else{
            System.out.println("FAIL!");
        }
        sc.close();

    }
}
