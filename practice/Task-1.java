import java.io.*;
import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        int n=10;    
        fizzbuzz(n);
   }

   static void fizzbuzz(int n) {
        for(int i=0;i<=n;i++){
            if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
   }
}