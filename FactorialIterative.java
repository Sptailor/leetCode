
// Program to calculate the factorial of a number.
// Demonstrates both iterative (loop) and recursive approaches.
// Factorial of n (n!) = n × (n-1) × (n-2) ... × 1
public class FactorialIterative {
    public static void main(String[] args) {
        int n = 5; // number to find factorial of
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}