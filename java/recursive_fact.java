
// Suhail Tailor
// This program calculates the factorial of a number using recursion.
// The factorial method repeatedly calls itself with (n-1) until it reaches the base case (0 or 1),
// then multiplies the results back up to get the final factorial value.

public class recursive_fact {

    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {   // base case
            return 1;// factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int number = 5;  // Example: factorial of 5
        int result = factorial(number);// Call factorial method
        System.out.println("Factorial of " + number + " is: " + result);/// Print the result
    }
}
