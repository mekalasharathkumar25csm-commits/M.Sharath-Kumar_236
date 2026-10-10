import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        c.add(10);
        c.add(20);
        c.add(30);

        Collection<Integer> c2 = new ArrayList<>();
        c2.add(20);
        c2.add(40);

        c.addAll(c2);

        System.out.println(c);
        System.out.println(c.contains(20));
        System.out.println(c.containsAll(c2));
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.remove(20);
        c.removeAll(c2);

        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        c.clear();
        System.out.println(c);
    }
}