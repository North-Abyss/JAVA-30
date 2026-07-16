import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        task4();
    }

    static void task4(){
        Scanner sc = new Scanner(System.in);
        // Question 1 - If Condition (Even/Odd)

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number % 2 == 0) System.out.println(number + " is Even");
        else System.out.println(number + " is Odd");
        System.out.println();

        // Question 2 - If-Else (Voting eligibility)
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age > 19) System.out.println("Eligible to vote");
        else System.out.println("Not eligible to vote");
        System.out.println();

        // Question 3 - Nested If (Largest of three numbers)
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter three numbers: " + a + " " + b + " " + c);
        
        if(a<b){
            if(b<c){
                System.out.println("Largest number is " + c);
            }
            else{
                System.out.println("Largest number is " + b);
            }
        }
        else{
            if(a<c){
                System.out.println("Largest number is " + c);
            }
            else{
                System.out.println("Largest number is " + a);
            }
        }

        System.out.println();

        // Question 4 - For Loop (1 to 10)
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + (i < 10 ? " " : ""));
        }
        System.out.println("\n");

        // Question 5 - For Loop Pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Question 6 - While Loop (10 down to 1)
        int x = 10;
        while (x >= 1) {
            System.out.print(x + (x > 1 ? " " : "")); x--;
        }
        System.out.println("\n");

        // Question 7 - While Loop Sum (first 5 natural numbers)
        int sum = 0; int i = 1;
        while (i <= 5) {
            sum += i; i++;
        }
        System.out.println("Sum = " + sum);
        System.out.println();

        // Question 8 - Basic Class (Student)
        Student student = new Student("Ravi", 85);
        student.printDetails();

        sc.close();
    }

    static class Student {
        String name; int mark;

        Student(String name, int mark) {
            this.name = name; this.mark = mark;
        }

        void printDetails() {
            System.out.println("Name: " + name); System.out.println("Marks: " + mark);
        }
    }
}
