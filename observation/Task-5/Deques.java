
   import java.util.Deque;
import java.util.ArrayDeque;

public class Deques{
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addLast(30);

        dq.offerFirst(10);
        dq.offerLast(40);

        System.out.println(dq);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq);
    }
} 
}
