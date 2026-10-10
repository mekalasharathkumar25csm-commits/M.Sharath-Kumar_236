import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println(list.get(2));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove(2);
        list.remove(Integer.valueOf(30));

        list.removeFirst();
        list.removeLast();

        list.offer(50);

        System.out.println(list.poll());

        System.out.println(list.peek());

        System.out.println(list);
    }
}