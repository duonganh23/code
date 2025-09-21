public class Main{
    public static void main(String[] args) {
        int[] numbers = { 3, 2, 4, 5, 1, 12, 9};
        for (int i = 0; i < numbers.length; i++){
        
            System.out.println(
                "Outer loop i = " + i + ", Value = " + numbers[i]
            );
        }
    }

    static void countdown(int n){
        System.out.println("call count down" + n);
        if (n > 0){

        }
    }
}