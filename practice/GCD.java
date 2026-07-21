public class GCDExample {
    
    // Method to calculate GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    public static void main(String[] args) {
        int number1 = 54;
        int number2 = 24;
        
        int gcd = findGCD(number1, number2);
        
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
        // Output: The GCD of 54 and 24 is: 6
    }
}
