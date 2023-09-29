package JavaLabReport;

import java.util.Scanner;

public class _7_grade_evaluation {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade of Student : ");
        int score  = sc.nextInt();
        char grade;

        if(score >= 90 && score <= 100){
            grade = 'A';
        }
        else if(score >= 80 && score <= 89){
            grade = 'B';
        }
        else if(score >= 70 && score <= 79){
            grade = 'C';
        }
        else if(score >= 60 && score <= 69){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("Student's grade: " + grade);

        sc.close();
    }
}
