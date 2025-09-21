import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("==============");
        System.out.println("Counter clockwise");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new ArrayDeque();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("++++++++++++");
        System.out.println("ArrayDeque Clockwise");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
