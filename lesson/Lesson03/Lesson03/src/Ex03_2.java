public class Ex03_2 {
    public static void main(String[] args) {
        int[] arr = {3, -1, 7, 8, 9, 5, 18, 11, -3, 4};
        int sum = 0, count = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num >= 0 && num % 2 == 1) {
                sum += num;
                count++;
                if (num < min) min = num;
                if (num > max) max = num;
            }
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Average: " + avg);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        } else {
            System.out.println("No odd non-negative elements found.");
        }
    }
}
