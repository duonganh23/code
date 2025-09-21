import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArraySearchExample {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 3, 12, 7, 12, 9, 1};
        int target = 8;
        
        // Find all positions of target number
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                positions.add(i);
            }
        }
        
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        if (positions.isEmpty()) {
            System.out.println("Target not found");
        } else {
            System.out.println("Found at positions: " + positions);
            System.out.println("Total occurrences: " + positions.size());
        }
    }
}
