
import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(30);

        deque.offerFirst(10);
        deque.offerLast(40);

        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque);
    }
}