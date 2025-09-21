public class Ex01 {
    public static void main(String[] args) {
        // 1. Create a recursive functoin t calculate the sum of all even numbers in range [A, B]
        // 2. Create a recursive function to find the maximum value in an array
        // 3. Create a recursive function to find an element in an array

        // 1.
        int sum;
        int start = 6;
        int end = 49;
        sum = tinhEven(start, end);
        System.out.println("Sum of all even numbers in range [" + start + ", " +  end  + "] " + sum);

        sum = tinhRecursion(start, end);
        System.out.println("\"Sum of all even numbers in range [\" + start + \", \" +  end  + \"] \" + sum");


    }

    // Iteration
    private static int tinhEven(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += (i % 2 == 0) ? i : 0;
        return sum;
    }

    // Recursion
    private static int tinhRecursion(int start, int end) {
        if (start > end) return 0; // base case: empty range
        if (start % 2 != 0) return tinhRecursion(start + 1, end); // skip odd start
        if (end % 2 != 0) return tinhRecursion(start, end - 1);   // skip odd end
        if (start == end) return start; // only one even number left
        return start + tinhRecursion(start + 2, end); // sum even numbers
    }


}
