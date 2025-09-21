import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        //Iterator<Integer> iterator = list.listIterator();
        //while (iterator.hasNext()){
        //    System.out.println(iterator.next());
        //}

        //Set<Integer> set = new HashSet<>();
        //set.add(1);
        //set.add(2);
        //set.add(4);
        //Iterator<Integer> iterator2 = set.iterator();
        //while (iterator2.hasNext()){
        //    System.out.println(iterator2.next());
        //}

        list.forEach(n ->{
            System.out.println(n);
        });
        /*int[] array = {1, 2, 3, 4, 5};
        for (int i: array){
            if (i==3) break;
            System.out.println(i);
        }*/
    }
}
