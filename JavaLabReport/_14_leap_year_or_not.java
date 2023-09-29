package JavaLabReport;

import java.util.Scanner;

public class _14_leap_year_or_not {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if( year % 400 == 0){
            System.out.println("Leap Year");
        }
        else if( year % 100 == 0 ){
            System.out.println("Not Leap Year");
        }
        else if( year % 4 == 0 ){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
        sc.close();
    }
}
