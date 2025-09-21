import java.util.*;

public class scope {
    int n = 10;

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i : arr){
            int x = 10;
        }
            //System.out.println(Utils.odd());
    }
    private int test(int x){
        int y = 10;
        System.out.println(n);
        //block 1
        {
            int z = 20;
            System.out.println(z);
        }
        //block 2
        {
            int z = 30;
            System.out.println(z);
        }
        return x + y;
    }
    private void display(){

    }
}
