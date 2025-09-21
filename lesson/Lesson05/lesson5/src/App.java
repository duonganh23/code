public class App {
    public static void main(String[] args) throws Exception {
        /*
        Review Function in Java
        - Why we need functions?: - reuse a piece of codes effectively in different contexts:
        Scope (1) within a class (2) within a project (3) within a workspace
        - how to declare a function?
        - how to call a function?
        */
        int[]arr = {9, 5, 3, 29, 8, -4};
        int max = findMax(arr);
        System.out.println("Max value: " + max);
    }
    // Function declaration
    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i > arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
