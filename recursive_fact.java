
//Suhail Tailor
public class recursive_fact {

    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {   // base case
            return 1;
        }
        return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int number = 5;  // Example: factorial of 5
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
