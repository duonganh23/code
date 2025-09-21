public class bubblesort {
    public static void main(String[] args) {
    int[] numbers = {1, 3, 4, 2, 5, 6, 8, 10, 7, 12, 11, 15, 13, 14, 17}; 
    for (int i = 0; i < numbers.length; i++) { 
            for (int j = i + 1; j < numbers.length - 1; j++) { 
                if (numbers[i] > numbers[j]) { 
                    int tempNumber = numbers[i]; 
                    numbers[i] = numbers[j]; 
                    numbers[j] = tempNumber; 
                } 
            } 
        }
        for (int number : numbers){
            System.out.print("|" + number + "|");
        }
        System.out.println("----------");
    }
    static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

