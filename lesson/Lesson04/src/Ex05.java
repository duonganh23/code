public class Ex05 {
    /*
      Review Function in Java
        - Why we need functions?
        - How to declare a function?
        - How to call a function?
      Recursion
        - It is a programming approach where a function calls itself to solve a problem.
        - It is useful for tasks that can be broken down into smaller, similar sub-problems.
        - Recursion (top-down approach) vs. Iteration (bottom-up approach)
     */
    // Example: Function declaration
    public static int add(int a, int b) {
        return a + b;
    }

    // Example: Recursive function (factorial)
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Function call
        int sum = add(3, 5);
        System.out.println("Sum: " + sum);

        // Recursive function call
        int fact = factorial(5);
        System.out.println("Factorial of 5: " + fact);
    }
}
