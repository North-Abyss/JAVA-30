import java.util.*;
//import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        int sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is: "+sum);
        
        //square of a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int square = num * num;
        System.out.println("Square of "+num+" is: "+square);

        //celsius to fahrenheit
        System.out.print("Enter temperature in celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius+" degree celsius is equal to "+fahrenheit+" degree fahrenheit"); 
        scanner.close();
    }
}
