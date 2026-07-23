import java.util.*;
import java.util.Scanner;
import java.io.*;

public class BuiltinFunctions {
    public static void main(String[] args) {
        // list all builtin functions in java 
        System.out.println("Builtin functions in Java:"); 
        // Input/output functions
        System.out.println("1. System.out.println()"); 
        System.out.println("2. System.in.read()");
        // Math functions
        System.out.println("3. Math.max()"); 
        System.out.println("4. Math.min()"); 
        System.out.println("5. Math.abs()"); 
        System.out.println("6. Math.sqrt()"); 
        System.out.println("7. Math.pow()"); 
        //String functions
        System.out.println("8. String.length()"); 
        System.out.println("9. String.charAt()"); 
        System.out.println("10. String.substring()"); 
        System.out.println("11. String.toUpperCase()"); 
        System.out.println("12. String.toLowerCase()"); 
        System.out.println("13. String.trim()"); 
        System.out.println("14. String.replace()");
        System.out.println("15. String.split()");
        // Array functions
        System.out.println("16. Arrays.sort()");
        System.out.println("17. Arrays.copyOf()");
        System.out.println("18. Arrays.toString()");
        System.out.println("19. Arrays.asList()");
        // HashMap functions
        System.out.println("20. HashMap.put()");
        System.out.println("21. HashMap.get()");
        System.out.println("22. HashMap.containsKey()");
        System.out.println("23. HashMap.containsValue()"); 
        System.out.println("24. HashMap.remove()");


        exampleFunction();
    }
    static void exampleFunction() {
        //Example of all builtin functions in java
        // Input/output functions
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();
        System.out.println("Hello, World! "+input);

        //make object for System.in and System.out to small code
        PrintStream out = System.out;
        out.println("Hello, World! "+sc.nextLine());

        // Math functions
        int max = Math.max(10, 20);
        int min = Math.min(10, 20);
        int abs = Math.abs(-10);
        double sqrt = Math.sqrt(16);
        double pow = Math.pow(2, 3);
        //String functions
        String str = " Hello, World! ";
        int length = str.length();
        char charAt = str.charAt(1);
        String substring = str.substring(1, 6);
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        String trim = str.trim();
        String replace = str.replace("Hello", "Hi");
        String[] split = str.split(" ");
                
        // Array functions
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);
        int[] copy = Arrays.copyOf(arr, arr.length);
        String arrString = Arrays.toString(arr);
        List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5);

        // HashMap functions
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        int value = map.get("one");
        boolean containsKey = map.containsKey("one");
        boolean containsValue = map.containsValue(1);
        map.remove("one");
        
        //print all the results
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Abs: "+abs);
        System.out.println("Sqrt: "+sqrt);
        System.out.println("Pow: "+pow);
        System.out.println("Length: "+length);
        System.out.println("CharAt: "+charAt);
        System.out.println("Substring: "+substring);
        System.out.println("UpperCase: "+upperCase);
        System.out.println("LowerCase: "+lowerCase);
        System.out.println("Trim: "+trim);
        System.out.println("Replace: "+replace);
        System.out.println("Split: "+Arrays.toString(split));
        System.out.println("Sorted Array: "+arrString);
        System.out.println("Array List: "+arrList);
        System.out.println("Copy of Array: "+Arrays.toString(copy));
        System.out.println("Value: "+value);
        System.out.println("Contains Key: "+containsKey);
        System.out.println("Contains Value: "+containsValue);  
        sc.close();

    }
}
