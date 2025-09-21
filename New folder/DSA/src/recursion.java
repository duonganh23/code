//import java.util.*;

public class recursion {
    //int n = 10;
    /*public static void main(String[] args) {
        //int [] array = {1, 2, 3, 4, 5};
        //for (int i : array){
        //    int x = 10;
        //}
        System.out.println(sum(10));
        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum += i;
        }
    }
    private static int sum(int n){
        if (n==0){
            return 0;
        }
        return n + sum(n - 1);
    }*/
    static void countdown(int n) {
    System.out.println("Call Count Down |" + n);
    if (n > 0) {
        System.out.print(n + "| ");
        countdown(n - 1);
    }
    }

    public static void main(String[] args) {
    countdown(10);
    }
}
