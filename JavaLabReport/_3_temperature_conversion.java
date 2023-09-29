package JavaLabReport;

import java.util.Scanner;

public class _3_temperature_conversion {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        // Celsius to Fahernheit
        System.out.print("Enter the temperature in Celsius : ");
        float Fahrenheit, Celsius;  
        Celsius = sc.nextFloat();  
        Fahrenheit = ((Celsius * 9) / 5) + 32;  
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
        
        System.out.print("Enter the temperature in Fahrenheit : ");
        Fahrenheit = sc.nextFloat();  
        Celsius = ((Fahrenheit - 32) * 5) / 9;  
        System.out.println("Temperature in Celsius is: " + Celsius);


        sc.close();
    }
    
}
