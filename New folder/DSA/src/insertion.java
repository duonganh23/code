public class insertion {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 5, 6, 8, 10, 7, 12, 11, 15, 13, 14, 17};
        insertionsort(numbers);
        for (int number : numbers){
            System.out.print("|" + number + "|");
        }
        System.out.println("----------");
    }
    static void insertionsort(int[] numbers){
        for (int i = 1; i < numbers.length; i++){
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > temp){
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j+1] = temp;
        }
    }
}
