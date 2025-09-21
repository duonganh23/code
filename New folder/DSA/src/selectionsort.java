import java.util.*;
public class selectionsort {
    int n = 10;
    public static void main(String[] args) {
        int []numbers = { 3, 2, 4, 5, 1, 12, 9, 6, 13, 10, 15};
        for (int i = 0; i < numbers.length; i++){
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[j] > numbers[minIndex]){
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
        }
        for (int number : numbers){
            System.out.println("|" + number + "|");
        }
    }

    static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
