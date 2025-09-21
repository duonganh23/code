import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        for (Integer i : set){
            System.out.println(i);
        }
        System.out.println("=========");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (Integer integer: list){
            System.out.println(integer);
        }
    }
}
